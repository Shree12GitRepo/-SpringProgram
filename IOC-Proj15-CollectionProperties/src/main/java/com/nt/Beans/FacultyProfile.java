package com.nt.Beans;

import java.util.Properties;

public class FacultyProfile {
	private Properties facultyprofile;

	public FacultyProfile(Properties facultyprofile) {
		this.facultyprofile = facultyprofile;
	}
	
	@Override
	public String toString() {
		return "FacultyProfile [facultyprofile=" + facultyprofile + "]";
	}
}
