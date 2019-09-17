package com.ShreeMedical.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.ShreeMedical.DTO.PatientDetailsDTO;
import com.ShreeMedical.DTO.PatientDetailsResultDTO;
import com.ShreeMedical.Service.PatientDetailsFind;
import com.ShreeMedical.command.PatientDetailsCommand;

public class PatientDetailsController extends AbstractCommandController {
	private PatientDetailsFind service;

	public PatientDetailsController(PatientDetailsFind service) {
		System.out.println("PatientDetailsController::1 Param constructor");
		this.service = service;
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
			
		/*Pass Data Command Class to DTO*/
			PatientDetailsCommand cmd=null;
			//create DTO class Object..
			PatientDetailsDTO dto=null;
			//cast from command to ActualCommand Class..
			cmd=(PatientDetailsCommand) command;
			//create the Object Of DTO
			dto=new PatientDetailsDTO();
			//copy from cmd to dto..
			BeanUtils.copyProperties(cmd, dto);
			
			List<PatientDetailsResultDTO> liDTO=null;
			liDTO=service.findPatientDetails(dto);
			System.out.println(liDTO);
			
		return new ModelAndView("patientList", "PDResult", liDTO);
	}

}
