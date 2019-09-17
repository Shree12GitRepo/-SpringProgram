package com.nt.Controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.Command.InsertHotelDetailsCommand;
import com.nt.DTO.InsertHotelDetailDTO;
import com.nt.Service.InsertHotelDetailsService;

@Controller
public class InsertHotelDetailsController {
	@Autowired
	private InsertHotelDetailsService service;
	
	@RequestMapping("/home.htm")
	public String hotelRecordForm(Map<String, Object> map) {
		return "hotel_form";
	}
	@RequestMapping("/insrtHTDT.htm")
	public String hotelRecordSubmission(Map<String, Object> map,InsertHotelDetailsCommand cmd) {
		System.out.println("RecordSubmission called...."+cmd.getName());
		InsertHotelDetailDTO dto=null;
		String msg=null;
		dto=new InsertHotelDetailDTO();
		
		//convert cmd to dto..
		BeanUtils.copyProperties(cmd, dto);
		//use Service...
		try 
		{
			msg=service.hotelRecords(dto);
			//create Model attribute..
			map.put("insrtmsg", msg);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "result";
		
	}//method

}//class
