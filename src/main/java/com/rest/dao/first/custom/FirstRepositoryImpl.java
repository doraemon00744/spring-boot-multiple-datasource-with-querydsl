package com.rest.dao.first.custom;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mysema.query.jpa.impl.JPAQuery;
import com.rest.config.QueryDslRepositorySupportWrapper;
import com.rest.dao.first.First;
import com.rest.dao.first.QFirst;

public class FirstRepositoryImpl extends QueryDslRepositorySupportWrapper implements FirstCustomRepository {

	public FirstRepositoryImpl() {
		super(First.class);
	}
	
	private EntityManager entityManager;
	
	@PersistenceContext(unitName = "first")
	public void setFirstEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
		super.setEntityManager(entityManager);
	}

	private QFirst first = QFirst.first;
	
	@Override
	public List<String> messages() {
		JPAQuery query = new JPAQuery(entityManager);
		return query.from(first).list(first.message);
	}
	
}
