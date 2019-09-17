package com.nt.DAO;

import java.util.List;

import com.nt.BO.HotelSearchBO;

public interface HotelSearchDAO {
	List<HotelSearchBO> searchHotelByLocation(String location) throws Exception;
}
