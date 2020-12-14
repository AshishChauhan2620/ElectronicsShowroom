package com.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addCategory(Category theCategory) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theCategory);

	}

	@Override
	public List<Category> viewListOfCategory() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Category> theQuery = currentSession.createQuery("from Category order by categoryName", Category.class);
		List<Category> categories = theQuery.getResultList();
		return categories;

	}
}
