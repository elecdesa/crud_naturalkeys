package org.naturalkeys.serviceimpl;

import java.util.List;

import org.naturalkeys.entity.Mensual;
import org.naturalkeys.repository.MensualRepository;
import org.naturalkeys.service.MensualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensualServiceImpl implements MensualService {

	@Autowired
	private MensualRepository mensualRepository;

	@Override
	public List<Mensual> list() {
		System.out.println(mensualRepository.findAll().toString());
		return mensualRepository.findAll();
	}

	@Override
	public Mensual getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mensual save(Mensual mensual) {
		return mensualRepository.save(mensual);
	}

	@Override
	public Mensual findByAnioAndMesAndCodalojamiento(String anio, String mes, String codalojamiento) {
		return mensualRepository.findByIdAnioAndIdMesAndIdCodalojamiento(anio, mes, codalojamiento);
	}

}
