package com.nt.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.nt.BO.InsertHotelDetailBO;
import com.nt.DAO.InsertHotelDetailIsmpl;
import com.nt.DTO.InsertHotelDetailDTO;

@Service("hotelService")
public class InsertHotelDetailsServiceImpl implements InsertHotelDetailsService{
	
	@Autowired
	private InsertHotelDetailIsmpl hdao;

	public String hotelRecords(InsertHotelDetailDTO dto) throws Exception {
		InsertHotelDetailBO bo=null;
		int count=0;
		bo=new InsertHotelDetailBO();
		//convert DTO to BO...
		BeanUtils.copyProperties(dto, bo);
		//use DAO..
		count =hdao.hotelrecordInsertion(bo);
		if(count==0)
		{
			return "Record Failed to Submit";
		}
		else {
			return "Record Successfully Submited";
		}
		
	}

}
