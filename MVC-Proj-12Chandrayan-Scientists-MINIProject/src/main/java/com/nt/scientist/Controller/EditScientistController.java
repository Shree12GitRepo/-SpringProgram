package com.nt.scientist.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.scientist.Command.ScientistCommand;
import com.nt.scientist.DTO.ScientistDTO;
import com.nt.scientist.Servicess.ScientistDetailsService;

public class EditScientistController extends SimpleFormController {
	//service Class Constructor..
	private ScientistDetailsService service;
	
	public EditScientistController(ScientistDetailsService service) {
		System.out.println("EditScientistController::1 Param Constructor");
		this.service = service;
	}

	@Override
	public Object formBackingObject(HttpServletRequest req) throws Exception {
		//get id of Scientist..
		int id=Integer.parseInt(req.getParameter("id"));
		System.out.println("Request Param "+id);
		ScientistDTO dto=null;
		//use service class...
		dto=service.fetchScientistDetailsById(id);
		//create command class Object...
		ScientistCommand cmd=new ScientistCommand();
		System.out.println("dto----"+dto.getId()+dto.getDomainName());
		//copy DTO to Command..
		BeanUtils.copyProperties(dto, cmd);
		System.out.println(cmd.getId()+cmd.getDomainName());
		System.out.println(cmd.toString());
		return cmd;
	}
	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		System.out.println("-------------ON-Submit----------");
		ScientistDTO dto=null;
		String updtMsg=null;
		//TypeCast Command..
		ScientistCommand cmd=(ScientistCommand) command;
		//convert cmd to DTO..
		System.out.println("onsubmit:"+cmd);
		dto=new ScientistDTO();
		BeanUtils.copyProperties(cmd, dto);
		
		//use Service Update method..
		updtMsg=service.updateScientistDetails(dto);
		return new ModelAndView(getSuccessView(), "UpdateMSg", updtMsg);
	}
}
