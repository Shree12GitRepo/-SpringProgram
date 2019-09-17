
package com.nt.Controller;

import java.util.List;

import com.nt.DTO.HotelSearchDTO;
import com.nt.Service.HotelSearchService;

public class HotelSearchController {
	private HotelSearchService hotelService;
	public HotelSearchController(HotelSearchService hotelService) {
		System.out.println("HotelSearchController::1-param");
		this.hotelService = hotelService;
	}
	
	List<HotelSearchDTO> liDTO=null;
	
	public List<HotelSearchDTO> getHotelListBylocation(String location[]) throws Exception
	{
		liDTO=hotelService.findHotelByLoaction(location);
		return liDTO;
		
	}
}
