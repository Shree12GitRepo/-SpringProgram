package com.nt.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.BO.InsertHotelDetailBO;

@Repository("hotelDAO")
public class InsertHotelDetailIsmpl implements InsertHotelDetailsDAO {
	@Autowired
	private JdbcTemplate jt;
	private final static String insert_Query="insert into HotelSearch values(hotel.nextval,?,?,?,?,?)";

	public int hotelrecordInsertion(InsertHotelDetailBO bo) throws Exception {
		int count=0;
		//insert query..
		count=jt.update(insert_Query,bo.getName(),bo.getState(),bo.getCity(),bo.getCouplefrndly(),bo.getType());
		return count;
	}

}
