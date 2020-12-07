package com.springmvc.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.SubCategory;

@Repository
public class SubCategoryDAOImpl implements SubCategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addSubCategory(SubCategory theSubCategory) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theSubCategory);

	}

	@Override
	public List<SubCategory> viewListOfSubCategory() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<SubCategory> cq = cb.createQuery(SubCategory.class);
		Root<SubCategory> root = cq.from(SubCategory.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

}
