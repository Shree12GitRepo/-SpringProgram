
package com.nt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.nt.DTO.HotelSearchDTO;
import com.nt.Service.HotelSearchService;
@Lazy
@Component("controller")
public class HotelSearchController {
	@Autowired
	private HotelSearchService hotelService;
	
	List<HotelSearchDTO> liDTO=null;
	
	public List<HotelSearchDTO> getHotelListBylocation(String location[]) throws Exception
	{
		liDTO=hotelService.findHotelByLoaction(location);
		return liDTO;
		
	}
}
