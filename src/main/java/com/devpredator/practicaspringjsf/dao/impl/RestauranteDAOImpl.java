/**
 * 
 */
package com.devpredator.practicaspringjsf.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.devpredator.practicaspringjsf.dao.RestauranteDAO;
import com.devpredator.practicaspringjsf.entity.Restaurante;

/**
 * @author DevPredator
 *
 */
@Repository
public class RestauranteDAOImpl implements RestauranteDAO {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("persistenceDevPredator");
	
	@Override
	public List<Restaurante> consultar() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		TypedQuery<Restaurante> queryTyped = (TypedQuery<Restaurante>) em.createQuery("FROM Restaurante ORDER BY nombre");
		
		return queryTyped.getResultList();
	}

}
