package com.ShreeMedical.DAO;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.ShreeMedical.BO.PatientDetailsBO;
import com.ShreeMedical.BO.PatientDetailsResultListBO;

public class patientDetailsDAOIMPL implements patientDetailsDAO {
	private final String get_patient_Detials="SELECT ID,PNAME,PADD,DISEASE,DOCTCONSLTNT as doctoConstlnt,REGISTRATIONDATEANDTIME FROM Patientdetails_shreeMedical WHERE PNAME=?";
	private JdbcTemplate jt;

	public patientDetailsDAOIMPL(JdbcTemplate jt) {
		System.out.println("patientDetailsDAOIMPL::JDBCConfiguration");
		this.jt = jt;
	}

	@Override
	public List<PatientDetailsResultListBO> searchPatient(PatientDetailsBO bo) {
		List<PatientDetailsResultListBO> liBO=null;
		BeanPropertyRowMapper<PatientDetailsResultListBO> rowmapper=null;
		//create rowmapper Object..
		rowmapper=new BeanPropertyRowMapper<PatientDetailsResultListBO>(PatientDetailsResultListBO.class);
		//retrive the record from the dataabse..
		//rowmapper.setMappedClass(PatientDetailsResultListBO.class);
		liBO= jt.query(get_patient_Detials, new RowMapperResultSetExtractor<PatientDetailsResultListBO>(rowmapper), bo.getPname());
		System.out.println("From DAO liBO values "+liBO);
		return liBO;
	}

}
