package com.nt.Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.nt.Command.UploadFileCmd;

@Controller
public class UploadFIle {
	
	@RequestMapping(value = "/upload.htm",method = RequestMethod.GET)
	public String showUploadForm(@ModelAttribute("upldCmd")UploadFileCmd cmd) {
		return "show_form";
	}
	@RequestMapping(value = "/upload.htm",method = RequestMethod.POST)
	public String upload(@ModelAttribute("upldCmd")UploadFileCmd cmd,Map<String,Object> map) throws IOException {
		System.out.println(cmd);
		MultipartFile file1=cmd.getFile1();
		MultipartFile file2=cmd.getFile2();
		String filename1=file1.getOriginalFilename();
		String filename2=file2.getOriginalFilename();
		
		//create file directory..
		File savefile1=new File("F:\\Store");
		
		if(!savefile1.exists())
			
			savefile1.mkdir();
		
		
		//read the file from source..
		InputStream is1=null,is2=null;
		is1=new FileInputStream(filename1);
		is2=new FileInputStream(filename2);
		System.out.println(is1+"---->"+is2);
		File firstFile=new File(filename1);
		File secondFile=new File(filename2);
		Integer filesize1=(int) (firstFile.length()/1024);
		Integer filesize2=(int) (secondFile.length()/1024);
		System.out.println(filesize1+"kb"+"<File----SIZE>"+filesize2+"kb");
		
		if(filesize1<=200 || filesize2<=30) {
			//write the file to destination..
			OutputStream os1=null,os2=null;
			os1=new FileOutputStream(savefile1+"/"+filename1);
			os2=new FileOutputStream(savefile1+"/"+filename2);
			//copy is1,is2 to Os1,Os2...
			IOUtils.copy(is1, os1);
			IOUtils.copy(is2, os2);	
			//keep the file in model attributes...
			map.put("file1", filename1+"Upload Successfully");
			map.put("file2", filename2+"UploadSuccessfully");
		}
		else {
			map.put("uplderr",new String("You can't Upload more than 200kb and 60 kb"));
		}
		
		System.out.println(filename2+"<<<->>>"+filename2);
		return "show_form";
	}
}
