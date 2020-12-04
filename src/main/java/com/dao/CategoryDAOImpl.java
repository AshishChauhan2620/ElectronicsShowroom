package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addCategory(Category theCategory) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCategory);
		
	}
}
