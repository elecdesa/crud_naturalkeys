package org.naturalkeys.serviceimpl;

import java.util.List;

import org.naturalkeys.entity.AuxMeses;
import org.naturalkeys.repository.AuxMesesRepository;
import org.naturalkeys.service.AuxMesesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuxMesesServiceImpl implements AuxMesesService {
	
	@Autowired
	private AuxMesesRepository auxMesesRepository;

	@Override
	public List<AuxMeses> list() {
		return auxMesesRepository.findAll();
	}

	@Override
	public AuxMeses findById(String id) {
		return auxMesesRepository.findOne(id);
	}

}
