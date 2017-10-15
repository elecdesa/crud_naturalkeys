package org.naturalkeys.service;

import java.util.List;

import org.naturalkeys.entity.AuxMeses;

public interface AuxMesesService {
	
	public List<AuxMeses> list();
	
	public AuxMeses findById(String id);

}
