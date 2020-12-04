package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.SubCategory;

@Repository
public class SubCategoryDAOImpl implements SubCategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addSubCategory(SubCategory theSubCategory) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theSubCategory);

	}
}
