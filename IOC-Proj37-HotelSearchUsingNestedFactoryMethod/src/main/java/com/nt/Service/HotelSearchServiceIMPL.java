package com.nt.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.BO.HotelSearchBO;
import com.nt.DAO.HotelSearchDAO;
import com.nt.DTO.HotelSearchDTO;

public class HotelSearchServiceIMPL implements HotelSearchService {
	private HotelSearchDAO hotelDAO;

	public HotelSearchServiceIMPL(HotelSearchDAO hotelDAO) {
		System.out.println("HotelSearchServiceIMPL::1-param");
		this.hotelDAO = hotelDAO;
	}

	@Override
	public List<HotelSearchDTO> findHotelByLoaction(String[] location) throws Exception {
		StringBuffer sb=null;
		List<HotelSearchDTO> liDTO=null;
		HotelSearchDTO dto=null;
		List<HotelSearchBO> liBO=null;
		sb=new StringBuffer("(");
		for(int i=0;i<location.length;++i)
		{
			if(i==location.length-1)
			{
				sb.append("'"+location[i]+"'");
			}
			else {
				sb.append("'"+location[i]+"',");
			}
		}
		sb.append(")");
		
		liDTO=new ArrayList<HotelSearchDTO>();
		//call DAO Method...
		liBO=hotelDAO.searchHotelByLocation(sb.toString());
		//convert BO to DAO..
		for(HotelSearchBO bo:liBO)
		{
			dto=new HotelSearchDTO();
			BeanUtils.copyProperties(bo, dto);
			//add dto to liDTO...
			liDTO.add(dto);
		}
		return liDTO;
	}

}
