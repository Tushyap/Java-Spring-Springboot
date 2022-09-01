package org.globallogic.center.service;

import java.util.List;
import org.globallogic.center.entity.DiagnosticResponse;
import org.globallogic.center.repository.DiagnosticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiagnosticServiceImpl implements DiagnosticService {
	
	@Autowired
	private DiagnosticRepository  diagnosticRepository;

	@Override
	public DiagnosticResponse saveDiagnosticResponse(DiagnosticResponse diagnosticResponse) {
		// TODO Auto-generated method stub
		return diagnosticRepository.save(diagnosticResponse);
	}

	@Override
	public List<DiagnosticResponse> getAllCenters() {
		// TODO Auto-generated method stub
		return diagnosticRepository.findAll();
	} 

	//constructor
	
}
