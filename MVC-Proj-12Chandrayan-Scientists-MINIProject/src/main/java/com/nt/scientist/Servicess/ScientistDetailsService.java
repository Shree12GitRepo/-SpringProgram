package com.nt.scientist.Servicess;

import java.util.List;

import com.nt.scientist.DTO.ScientistDTO;

public interface ScientistDetailsService {
	public List<ScientistDTO> fetchScientistDetails();
	public ScientistDTO fetchScientistDetailsById(int id);
	public String updateScientistDetails(ScientistDTO dto);
	public String removeScientistDetails(ScientistDTO dto);
}
