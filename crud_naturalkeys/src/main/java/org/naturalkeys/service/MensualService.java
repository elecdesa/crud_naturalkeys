package org.naturalkeys.service;

import java.util.List;

import org.naturalkeys.entity.Mensual;

public interface MensualService {

	public List<Mensual> list();

	public Mensual getById(Long id);

	public Mensual save(Mensual mensual);

	public Mensual findByAnioAndMesAndCodalojamiento(String anio, String mes, String codalojamiento);

}
