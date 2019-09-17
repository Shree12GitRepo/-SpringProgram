package com.nt.Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Filedownload {
	@RequestMapping("index.htm")
	public String showfile() {
		System.out.println("-------showfile Called--");
		return "download_file";
	}
	@RequestMapping("download.htm")
	public void downloadFile(HttpServletRequest req,HttpServletResponse res) throws IOException {
		System.out.println("-------downloadFile() called-----");
		ServletContext sc=null;
		File file=null;
		InputStream is=null;
		OutputStream os=null;
		//get the Parameter name..
		String paramName=req.getParameter("fname");
		//get Context param value..
		sc=req.getServletContext();
		String location=sc.getInitParameter("filelocation");
		//locate the file..
		file=new File(location+"/"+paramName);
		//get the length of File and make it as response content length..
		res.setContentLengthLong(file.length());
		//get the MIME Of the File and make it as response type..
		res.setContentType(sc.getMimeType(location+"/"+paramName));
		//make browser make recieved output as download file
		res.addHeader("Content-Disposition","attachment;fileName="+file);
		//create InputStream pointing to file
		is=new FileInputStream(file);
		//create output stream poiting to response obj
		os=res.getOutputStream();
		//copy file content to response object
		IOUtils.copy(is, os);
		//close steams
		os.close();
		is.close();
		
	}
}
