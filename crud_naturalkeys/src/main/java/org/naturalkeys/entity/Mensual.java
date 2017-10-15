package org.naturalkeys.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Mensual")
public class Mensual {

	@EmbeddedId
	private MensualPK id;


	@NotNull
	private int plazas;

	public Mensual() {

	}

	public MensualPK getId() {
		return id;
	}

	public void setId(MensualPK id) {
		this.id = id;
	}

	
	
	
	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	@Override
	public String toString() {
		return "Mensual [id=" + id + ", plazas=" + plazas + "]";
	}

	
	
}
