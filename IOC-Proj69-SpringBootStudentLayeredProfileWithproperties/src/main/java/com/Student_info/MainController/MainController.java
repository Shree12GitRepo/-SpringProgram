package com.Student_info.MainController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Student_info.DTO.StudentDTO;
import com.Student_info.Servicess.Student_infoServicess;
import com.Student_info.VO.StudentVO;
@Controller("ctrl")
public class MainController {
	StudentDTO dto=null;
	String msg=null;
	@Autowired
	private Student_infoServicess sis;
	
	public String Student_infoRegistration(StudentVO vo)  {
		dto=new StudentDTO();
		dto.setName(vo.getName());
		dto.setRoll(Integer.parseInt(vo.getRoll()));
		dto.setAddress(vo.getAddress());
		dto.setMark1(Integer.parseInt(vo.getMark1()));
		dto.setMark2(Integer.parseInt(vo.getMark2()));
		dto.setMark3(Integer.parseInt(vo.getMark3()));
		try {
			msg=sis.student_infoDetails(dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
		
}
