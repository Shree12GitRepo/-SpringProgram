package com.nt.Command;

import org.springframework.web.multipart.MultipartFile;

public class UploadFileCmd {
	private MultipartFile file1,file2;
	
	public UploadFileCmd() {
		System.out.println("UploadFileCmd::0-Param");
	}

	public MultipartFile getFile1() {
		return file1;
	}

	public MultipartFile getFile2() {
		return file2;
	}

	public void setFile1(MultipartFile file1) {
		this.file1 = file1;
	}

	public void setFile2(MultipartFile file2) {
		this.file2 = file2;
	}

	@Override
	public String toString() {
		return "UploadFileCmd [file1=" + file1 + ", file2=" + file2 + "]";
	}
}
