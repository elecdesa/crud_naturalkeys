package org.naturalkeys.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Embeddable
public class MensualPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	@NotEmpty
	@Size(min = 4, max = 4)
	@Column(unique = true, nullable = false, length = 4)
	private String anio;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 2)
	@Column(unique = true, nullable = false, length = 2)
	private String mes;

	@NotNull
	@Size(min = 6, max = 7)
	@Column(unique = true, nullable = false, length = 7)
	private String codalojamiento;

	public MensualPK() {
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getCodalojamiento() {
		return codalojamiento;
	}

	public void setCodalojamiento(String codalojamiento) {
		this.codalojamiento = codalojamiento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anio == null) ? 0 : anio.hashCode());
		result = prime * result + ((codalojamiento == null) ? 0 : codalojamiento.hashCode());
		result = prime * result + ((mes == null) ? 0 : mes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MensualPK other = (MensualPK) obj;
		if (anio == null) {
			if (other.anio != null)
				return false;
		} else if (!anio.equals(other.anio))
			return false;
		if (codalojamiento == null) {
			if (other.codalojamiento != null)
				return false;
		} else if (!codalojamiento.equals(other.codalojamiento))
			return false;
		if (mes == null) {
			if (other.mes != null)
				return false;
		} else if (!mes.equals(other.mes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MensualPK [anio=" + anio + ", mes=" + mes + ", codalojamiento=" + codalojamiento + "]";
	}

}