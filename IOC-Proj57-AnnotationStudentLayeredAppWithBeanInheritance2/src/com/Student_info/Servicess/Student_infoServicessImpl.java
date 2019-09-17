package com.Student_info.Servicess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student_info.BO.StudentBO;
import com.Student_info.DAO.Student_infoDAO;
import com.Student_info.DTO.StudentDTO;

@Service("StudentService")
public class Student_infoServicessImpl implements Student_infoServicess{
	@Autowired
	private Student_infoDAO sdao;
	
	@Override
	public String student_infoDetails(StudentDTO dto)throws Exception {
		//calculate the Tottal mark..
		
		int Mark1=dto.getMark1();
		int Mark2=dto.getMark2();
		int Mark3=dto.getMark3();
		int totalMark=300;
		//calculate Secure mark
		int SecureMark=Mark1+Mark2+Mark3;
		//calculate Percentage...
		int percentage =(SecureMark*100)/totalMark;
		StudentBO bo=new StudentBO();
		bo.setName(dto.getName());
		bo.setRoll(dto.getRoll());
		bo.setAddress(dto.getAddress());
		bo.setMark1(dto.getMark1());
		bo.setMark2(dto.getMark2());
		bo.setMark3(dto.getMark3());
		bo.setTotalMark(totalMark);
		bo.setPercentage(percentage);
		int res=sdao.insert(bo);
		if(res==1)
		{
			return "Inserted Successed";
		}
		else
		{
			return "Insertion Cancelled";
		}
	}
}
