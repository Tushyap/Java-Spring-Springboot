package org.globallogic.center.service;

import java.util.List;
import org.globallogic.center.entity.DiagnosticResponse;

public interface DiagnosticService {
	
	public DiagnosticResponse saveDiagnosticResponse(DiagnosticResponse diagnosticResponse);
	
	List<DiagnosticResponse> getAllCenters();
	
//	DiagnosticResponse getCenter(Long Id);
	
	//Diagnostic updateCenter(Diagnostic DiagnosticResponse);

}
