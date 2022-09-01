package org.globallogic.appointment.service;

import java.util.List;

import org.globallogic.appointment.entity.AppointmentResponseTB;

public interface AppointmentService {
	
	//to save
	public AppointmentResponseTB saveAppointment(AppointmentResponseTB appointment);
	
	//to get all
	public List<AppointmentResponseTB> showAllAppointment();
	
	//to get by id
	public AppointmentResponseTB showAppointmentById(Long Id);
	
	//to update details
	public AppointmentResponseTB updateAppointment(AppointmentResponseTB appointment);
	
	//to delete
	public void deleteAppointment(Long Id);
}
