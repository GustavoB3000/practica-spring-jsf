/**
 * 
 */
package com.devpredator.practicaspringjsf.services;

import java.util.List;

import com.devpredator.practicaspringjsf.entity.Restaurante;

/**
 * @author DevPredator
 * Interface de prueba para implementar metodos y se pueda utilizar anotaciones con SPRING.
 */
public interface RestauranteService {

	List<Restaurante> consultarRestaurantes();
}
