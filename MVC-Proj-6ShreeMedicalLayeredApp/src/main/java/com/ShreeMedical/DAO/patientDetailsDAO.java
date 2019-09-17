package com.ShreeMedical.DAO;

import java.util.List;

import com.ShreeMedical.BO.PatientDetailsBO;
import com.ShreeMedical.BO.PatientDetailsResultListBO;

public interface patientDetailsDAO {
	public List<PatientDetailsResultListBO> searchPatient(PatientDetailsBO bo);
}
