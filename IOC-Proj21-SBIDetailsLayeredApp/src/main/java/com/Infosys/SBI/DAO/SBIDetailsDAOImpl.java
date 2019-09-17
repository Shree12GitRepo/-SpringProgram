package com.Infosys.SBI.DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

import javax.sql.DataSource;

import com.Infosys.SBI.BO.SBIDetailsBO;

public class SBIDetailsDAOImpl implements SBIDetailsDAO {
	//Insert_Query..
	private String SBI_insert_query="insert into  SBI_All_Info values(SBI_INFO.nextval,?,?,?,?,?,?,?)";
	//configure DataSource..
	private DataSource ds;
	public SBIDetailsDAOImpl(DataSource ds) {		
		this.ds = ds;
		System.out.println(ds.getClass());
	}

	public int insert_Query(SBIDetailsBO bo) throws SQLException {
		Connection con=null;
		int result=0;
		//Establish The Connection..
		con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(SBI_insert_query);
		//set the Values..
		ps.setString(1, bo.getBranch_name());
		ps.setString(2, bo.getBank_Mgr_Name());
		ps.setString(3, bo.getBranch_Mgr_Name());
		ps.setString(4, bo.getAccountant_Name());
		ps.setString(5, bo.getSecurity_Guard_Name());
		ps.setInt(6, bo.getIfsc_code());
		System.out.println(bo.getDoj());
		ps.setDate(7, new java.sql.Date( bo.getDoj().getTime()));
		result=ps.executeUpdate();
		return result;
	}

}
