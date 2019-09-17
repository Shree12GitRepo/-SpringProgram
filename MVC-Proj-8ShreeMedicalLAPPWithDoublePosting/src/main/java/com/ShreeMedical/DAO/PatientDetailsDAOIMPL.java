package com.ShreeMedical.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ShreeMedical.BO.PatientDetailsBO;

public class PatientDetailsDAOIMPL implements PatientDetailsDAO {
	//use Insert Query..
	private final String INSERT_QUERY="INSERT INTO Patientdetails_shreeMedical VALUES(patient_ID.nextval,?,?,?,?,?)";
	//use jdbcTemplate
	private JdbcTemplate jt;

	public PatientDetailsDAOIMPL(JdbcTemplate jt) {
		System.out.println("PatientDetailsDAOIMPL::1 Param)");
		this.jt = jt;
	}

	@Override
	public int insertPatientDetails(PatientDetailsBO bo) {
		int count=0;
		//use jt
		count=jt.update(INSERT_QUERY, bo.getPname(),bo.getPadd(),bo.getDisease(),bo.getDoctors(),bo.getRegeistrationdate());
		return count;
	}

}
