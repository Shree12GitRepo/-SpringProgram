package com.nt.Service;

import java.util.List;

import com.nt.DTO.SIMDistributorDTO;

public interface SIMDistributorService {
	public List<SIMDistributorDTO> get_Distributor_detail_BySIMName(String simName[]) throws Exception;
}
