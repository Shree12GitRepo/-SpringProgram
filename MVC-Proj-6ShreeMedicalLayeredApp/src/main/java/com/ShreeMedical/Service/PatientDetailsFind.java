package com.ShreeMedical.Service;

import java.util.List;

import com.ShreeMedical.DTO.PatientDetailsDTO;
import com.ShreeMedical.DTO.PatientDetailsResultDTO;

public interface PatientDetailsFind {
	public List<PatientDetailsResultDTO> findPatientDetails(PatientDetailsDTO dto);

}
