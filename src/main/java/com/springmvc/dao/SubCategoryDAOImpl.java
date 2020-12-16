
package com.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.SubCategory;

@Repository
public class SubCategoryDAOImpl implements SubCategoryDAO {
	// injecting the session factory

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addSubCategory(SubCategory theSubCategory) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theSubCategory);

	}

	@Override
	public List<SubCategory> viewListOfSubCategory() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<SubCategory> theQuery = currentSession.createQuery("from SubCategory order by subCategoryName",
				SubCategory.class);
		List<SubCategory> subCategories = theQuery.getResultList();
		return subCategories;

	}

}
