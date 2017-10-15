package org.naturalkeys.repository;

import java.io.Serializable;

import org.naturalkeys.entity.Mensual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensualRepository extends JpaRepository<Mensual, Serializable> {

	Mensual findByIdAnioAndIdMesAndIdCodalojamiento(String anio, String mes, String codalojamiento);
}
