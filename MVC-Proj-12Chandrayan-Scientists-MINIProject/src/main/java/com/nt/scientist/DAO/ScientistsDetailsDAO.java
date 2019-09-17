package com.nt.scientist.DAO;

import java.util.List;

import com.nt.scientist.BO.ScientistBO;

public interface ScientistsDetailsDAO {
	public List<ScientistBO>getScientistDetails();
	public ScientistBO getScientistDetailsById(int id);
	public int getScientistUpdate(ScientistBO bo);
	public int getScientistDeletion(ScientistBO bo);
}
