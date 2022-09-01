package org.globallogic.appointment.service;

import java.util.List;

import org.globallogic.appointment.entity.AppointmentResponseTB;
import org.globallogic.appointment.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	private AppointmentRepository appointmentRepository;

	@Override
	public AppointmentResponseTB saveAppointment(AppointmentResponseTB appointment) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointment);
	}

	@Override
	public List<AppointmentResponseTB> showAllAppointment() {
		// TODO Auto-generated method stub
		return appointmentRepository.findAll();
	}

	@Override
	public AppointmentResponseTB showAppointmentById(Long Id) {
		// TODO Auto-generated method stub
		return appointmentRepository.findById(Id).get();
	}

	@Override
	public AppointmentResponseTB updateAppointment(AppointmentResponseTB appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAppointment(Long Id) {
		// TODO Auto-generated method stub
		
	}


	
}
