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

	public HotelSearchDAOIMPL(DataSource ds) {
		System.out.println("HotelSearchDAO::1ParaM");
		this.ds = ds;
	}

	@Override
	public List<HotelSearchBO> searchHotelByLocation(String location) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		HotelSearchBO bo = null;
		List<HotelSearchBO> liBO = null;
		try {

			
			// Establish the Connection...
			con = ds.getConnection();
			// use prepare Statement..
			System.out.println("From DAO--->"+location);
			ps = con.prepareStatement("SELECT ID,NAME,STATE,CITY,COUPLEFRNDLY,TYPE FROM HOTELSEARCH WHERE CITY IN "+location +"");
			// execute the query....
			rs = ps.executeQuery();
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
			}

		} catch (SQLException se) {
			throw se;
		} catch (Exception e) {
			throw e;
		} // catch..
		finally {
			// close PS...
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				throw e;
			}

			// close con...
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				throw e;
			}
		} // finally
		return liBO;
	}// method

}// class
