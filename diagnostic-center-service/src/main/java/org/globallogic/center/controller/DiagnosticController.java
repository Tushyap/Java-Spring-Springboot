package org.globallogic.center.controller;

import java.util.ArrayList;
import java.util.List;

import org.globallogic.center.entity.Appointment;
import org.globallogic.center.entity.Diagnostic;
import org.globallogic.center.entity.DiagnosticResponse;
import org.globallogic.center.entity.Test;
import org.globallogic.center.service.DiagnosticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/diagnostic")
public class DiagnosticController {
	
	@Autowired
	private DiagnosticService diagnosticService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/save")
	public Diagnostic saveDiagnostic(@RequestBody Diagnostic diagnostic)
	{
		DiagnosticResponse temp = new DiagnosticResponse();
		temp.setCenterName(diagnostic.getCenterName());
		List<Long> list= new ArrayList<Long>();
		for(Test test: diagnostic.getTests()) {
			list.add(test.getTestId());
		}
		temp.setTestIds(list);
		list= new ArrayList<Long>();
		for(Appointment appointment: diagnostic.getApppointmentList()) {
			list.add(appointment.getAppointmentId());
		}
		temp.setAppointmentIds(list);
		diagnosticService.saveDiagnosticResponse(temp);
		diagnostic.setCenterId(temp.getCenterId());
		return diagnostic;
	}
	
//	@GetMapping("/get")
//	public List<DiagnosticResponse> saveDiagnosticResponse()
//	{
//		List<Diagnostic> list = diagnosticService.getAllCenters();
//		List<DiagnosticResponse> listOne = new ArrayList<DiagnosticResponse>();
//		for(Diagnostic temp : list)
//		{
//			DiagnosticResponse diagnosticResponse = new DiagnosticResponse();
//			diagnosticResponse.setCenterId(temp.getCenterId());
//			diagnosticResponse.setCenterName(temp.getCenterName());
//			for(Long centerObj : temp.getTestIds())
//			{
//				diagnosticResponse.getTests()
//						.add(restTemplate.getForObject("http://localhost:8400/test/show/" + centerObj,  Test.class));
//			}
//			for(Long centerOb : temp.getAppointmentIds())
//			{
//				diagnosticResponse.getApnt()
//						.add(restTemplate.getForObject("http://localhost:8401/appoint/show/" + centerOb, Appointment.class));
//			}
//			listOne.add(diagnosticResponse);
//		}
//		return listOne;
//	}
	
//	@GetMapping("/get/{id}")
//	public DiagnosticResponse getCenterById(@PathVariable("id") Long Id)
//	{
//		Diagnostic temp = diagnosticService.getCenter(Id);
//		DiagnosticResponse dObj = new DiagnosticResponse();
//		dObj.setCenterId(temp.getCenterId());
//		dObj.setCenterName(temp.getCenterName());
//		for(Long cObj : temp.getTestIds())
//		{
//			dObj.getTests()
//			.add(restTemplate.getForObject("http://localhost:8400/test/show/" + cObj, Test.class));
//		}
//		for(Long cObje : temp.getAppointmentIds())
//		{
//			dObj.getApnt()
//			.add(restTemplate.getForObject("http://localhost:8401/appoint/show/" + cObje, Appointment.class));
//		}
//		return dObj;
//	}
}
