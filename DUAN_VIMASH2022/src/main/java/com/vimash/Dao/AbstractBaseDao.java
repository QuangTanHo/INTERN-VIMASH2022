package com.vimash.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractBaseDao {
	private EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	@PersistenceContext()
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
