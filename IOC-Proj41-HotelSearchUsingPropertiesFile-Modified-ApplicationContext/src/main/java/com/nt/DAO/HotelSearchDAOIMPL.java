package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.BO.HotelSearchBO;

public class HotelSearchDAOIMPL implements HotelSearchDAO {
	private DataSource ds;
	private String syprop;

	public void setSyprop(String syprop) {
		this.syprop = syprop;
	}

	public String getSyprop() {
		return syprop;
	}
	
	public HotelSearchDAOIMPL(DataSource ds) {
		System.out.println("HotelSearchDAO::1ParaM");
		this.ds = ds;
	}
	

	@Override
	public List<HotelSearchBO> searchHotelByLocation(String location) throws Exception {
		//Print System Properties..
		System.out.println("System Propertis Runtime Name--->"+syprop);
		HotelSearchBO bo = null;
		List<HotelSearchBO> liBO = null;
		// Establish the Connection...
		try(Connection con = ds.getConnection()) {
			// use prepare Statement..
			System.out.println("From DAO--->"+location);
			try(PreparedStatement ps = con.prepareStatement("SELECT ID,NAME,STATE,CITY,COUPLEFRNDLY,TYPE FROM HOTELSEARCH WHERE CITY IN "+location +"")){
				// execute the query....
				try(ResultSet rs = ps.executeQuery()){
					
					liBO = new ArrayList<HotelSearchBO>();
					while (rs.next()) {
						bo = new HotelSearchBO();
						bo.setId(rs.getInt(1));
						bo.setName(rs.getString(2));
						bo.setState(rs.getString(3));
						bo.setCity(rs.getString(4));
						bo.setCoupleFriendly(rs.getString(5));
						bo.setType(rs.getString(6));
						// add bo to liBO..
						liBO.add(bo);
					
				}//While
			}//try
			
			}//try

		}//try
		catch (SQLException se) {
			throw se;
		} catch (Exception e) {
			throw e;
		} // catch..
		
		return liBO;
	}// method


	

}// class
