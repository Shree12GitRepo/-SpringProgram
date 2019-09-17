package com.nt.Service;

import java.util.List;

import com.nt.DTO.HotelSearchDTO;

public interface HotelSearchService {
	public List<HotelSearchDTO> findHotelByLoaction(String location[]) throws Exception;

}
