/**
 * 
 */
package com.devpredator.practicaspringjsf.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author DevPredator
 *
 */
@Entity
@Table(name = "tipo_restaurante")
public class TipoRestaurante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoRestaurante;
	
	@Column(name = "descripcion", length = 500, nullable = false)
	private String descripcion;
	
	@Column(name = "fechaCreacion", nullable = false)
	private LocalDateTime fechaCreacion;
	
	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModificacion;
	
	@Column(name = "estatus", nullable = false)
	private boolean estatus;

	/**
	 * @return the id
	 */
	public Long getIdTipoRestaurante() {
		return idTipoRestaurante;
	}

	/**
	 * @param id the id to set
	 */
	public void setIdTipoRestaurante(Long idTipoRestaurante) {
		this.idTipoRestaurante = idTipoRestaurante;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fechaModificacion
	 */
	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
}
