package org.globallogic.appointment.controller;

import java.util.ArrayList;
import java.util.List;

import org.globallogic.appointment.entity.Appointment;
import org.globallogic.appointment.entity.AppointmentResponseTB;
import org.globallogic.appointment.entity.Test;
import org.globallogic.appointment.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/appoint")
public class AppointmentController {
	
	@Autowired
	private AppointmentService  appointmentService;

	@Autowired
	private RestTemplate restTemplate;
		//get all details
		@GetMapping("/show")
		public List<Appointment> showAppointment() {
			List<AppointmentResponseTB> lists = appointmentService.showAllAppointment();
			List<Appointment> listTemp = new ArrayList<Appointment>();
			for(AppointmentResponseTB temp: lists) {
				Appointment appointment = new Appointment();
				appointment.setAppointmentId(temp.getAppointmentId());
				appointment.setUserId(temp.getUserId());
				appointment.setDateTime(temp.getDateTime());
				appointment.setApproved(temp.isApproved());
				appointment.setTest(restTemplate.getForObject("http://localhost:8111/test/get/"+ temp.getTestId(), Test.class));
				appointment.setCenterId(temp.getCenterId());
				listTemp.add(appointment);
			}
			return listTemp;
		}
		
		// get specific detail 
//		@GetMapping("/show/{id}")
//		public Appointment showAppointmentById(@PathVariable("id") Long Id) {
//			return appointmentService.showAppointmentById(Id);
//		}

		// save details 
		@PostMapping("/save")
		public Appointment saveAppointments(@RequestBody Appointment appointment) {
			AppointmentResponseTB apmtTemp = new AppointmentResponseTB();
			apmtTemp.setUserId(appointment.getUserId());
			apmtTemp.setDateTime(appointment.getDateTime());
			apmtTemp.setApproved(appointment.isApproved());
			apmtTemp.setTestId(appointment.getTest().getTestId());
			apmtTemp.setCenterId(appointment.getCenterId());
			apmtTemp=appointmentService.saveAppointment(apmtTemp);
			appointment.setAppointmentId(apmtTemp.getAppointmentId());
				return appointment ;
		}
		
		//updating test details
//		@PutMapping("/update/{id}")
//		public Appointment updateAppointmentById(@PathVariable("id") Long Id, @RequestBody Appointment appointment)
//		{
//			appointment.setAppointmentId(Id);
//			return appointmentService.updateAppointment(appointment);
//		}

//		@DeleteMapping("/delete/{id}")
//		public String deleteAppointmentDetails(@PathVariable("id") Long Id)
//		{
//			Appointment appointment = appointmentService.showAppointmentById(Id);
//			appointmentService.deleteAppointment(Id);
//			return "Appointed Deleted";
//		}
}
