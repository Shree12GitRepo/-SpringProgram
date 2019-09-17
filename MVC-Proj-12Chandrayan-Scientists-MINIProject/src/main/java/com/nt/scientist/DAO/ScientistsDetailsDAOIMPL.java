package com.nt.scientist.DAO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.nt.scientist.BO.ScientistBO;

public class ScientistsDetailsDAOIMPL implements ScientistsDetailsDAO {
	private final static String getScientist_details="SELECT ID,NAME,DOMAINNAME,EXPERIENCE,PETENTS FROM INDIAN_SCIENTISTS";
	private final static String getScientist_details_By_Id="SELECT ID,NAME,DOMAINNAME,EXPERIENCE,PETENTS FROM INDIAN_SCIENTISTS WHERE ID=?";
	private final static String getScientist_Update="UPDATE INDIAN_SCIENTISTS SET NAME=?,DOMAINNAME=?,EXPERIENCE=?,PETENTS=? WHERE ID=?";
	private final static String getScientist_Delete="DELETE ID,NAME,DOMAINNAME,EXPERIENCE,PETENTS FROM INDIAN_SCIENTISTS WHERE ID=?";
	private JdbcTemplate jt;
	public ScientistsDetailsDAOIMPL(JdbcTemplate jt) {
		System.out.println("ScientistsDetailsDAOIMPL");
		this.jt = jt;
	}
	@Override
	
	public List<ScientistBO> getScientistDetails() {
		List<ScientistBO> liBO=null;
		ScientistBO bo=null;
		BeanPropertyRowMapper<ScientistBO> rowmapper=null;
		rowmapper=new BeanPropertyRowMapper<ScientistBO>(ScientistBO.class);
		//create Bo class Object..
		bo=new ScientistBO();
		System.out.println(bo.getId()+bo.getName()+bo.getDomainName()+bo.getPetents()+bo.getExperience());
		liBO=jt.query(getScientist_details,new RowMapperResultSetExtractor<ScientistBO>(rowmapper));
		
		return liBO;
		
	}
	
	@Override
	public ScientistBO getScientistDetailsById(int id) {
		ScientistBO bo=null;
		bo=new ScientistBO();
		bo=jt.queryForObject(getScientist_details_By_Id, new BeanPropertyRowMapper<ScientistBO>(ScientistBO.class),id);
		System.out.println(bo.getId());
		return bo;
	}
	@Override
	public int getScientistUpdate(ScientistBO bo) {
		System.out.println("before DB :"+bo.toString());
		int result=0;
		result=jt.update(getScientist_Update,bo.getName(),bo.getDomainName(),bo.getExperience(),bo.getPetents(),bo.getId());
		
		System.out.println("DB result:"+result);
		return result;
	}
	@Override
	public int getScientistDeletion(ScientistBO bo) {
		int delresult=0;
		delresult=jt.update(getScientist_Delete,bo.getId());
		return delresult;
	}
	
	
}
