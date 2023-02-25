/**
 * 
 */
package com.devpredator.practicaspringjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicaspringjsf.entity.Restaurante;
import com.devpredator.practicaspringjsf.services.RestauranteService;

/**
 * @author DevPredator
 * Controlador de ejemplo para demostrar la integracion de Spring con JSF.
 */
@ManagedBean
@ViewScoped
public class RestauranteController {

	private List<Restaurante> restaurantes;
	
	private List<Restaurante> restaurantesFiltrados;
	
	@ManagedProperty("#{restauranteServiceImpl}")
	private RestauranteService restauranteServiceImpl;
	
	@PostConstruct
	public void init() {		
		this.restaurantes = this.restauranteServiceImpl.consultarRestaurantes();
	}

	/**
	 * @return the restaurantes
	 */
	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	/**
	 * @param restaurantes the restaurantes to set
	 */
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

	/**
	 * @return the restaurantesFiltrados
	 */
	public List<Restaurante> getRestaurantesFiltrados() {
		return restaurantesFiltrados;
	}

	/**
	 * @param restaurantesFiltrados the restaurantesFiltrados to set
	 */
	public void setRestaurantesFiltrados(List<Restaurante> restaurantesFiltrados) {
		this.restaurantesFiltrados = restaurantesFiltrados;
	}

	/**
	 * @return the restauranteServiceImpl
	 */
	public RestauranteService getRestauranteServiceImpl() {
		return restauranteServiceImpl;
	}

	/**
	 * @param restauranteServiceImpl the restauranteServiceImpl to set
	 */
	public void setRestauranteServiceImpl(RestauranteService restauranteServiceImpl) {
		this.restauranteServiceImpl = restauranteServiceImpl;
	}


}
