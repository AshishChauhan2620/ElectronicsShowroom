package com.springmvc.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.ProductDetails;

@Repository
public class ProductDetailsDAOImpl implements ProductDetailsDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addProdcutDetails(ProductDetails theProductDetails) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theProductDetails);

	}

	@Override
	public List<ProductDetails> viewInventoryByProductBrand(String productBrand) {
		Session currentSession = sessionFactory.getCurrentSession();
		String sql = "SELECT * FROM PRODUCT_DETAILS WHERE BRAND = :productBrand";
		SQLQuery query = currentSession.createSQLQuery(sql);
		query.addEntity(ProductDetails.class);
		query.setParameter("productBrand", productBrand);
		List results = query.list();
		return results;

	}

	@Override
	public ProductDetails viewInventoryByProductId(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDetails> viewInventoryByAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
