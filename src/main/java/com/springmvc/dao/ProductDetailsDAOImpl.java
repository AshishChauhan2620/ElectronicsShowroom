package com.springmvc.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.springmvc.entity.ProductDetails;

@Repository
public class ProductDetailsDAOImpl implements ProductDetailsDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addProductDetails(ProductDetails theProductDetails) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theProductDetails);

	}

	@Override
	public String updateProductDetailsByProductId(int productId) {
		Session currentSession = sessionFactory.getCurrentSession();
		String sql = "SELECT * FROM PRODUCT_DETAILS WHERE PRODUCT_ID = :productId";
		SQLQuery query = currentSession.createSQLQuery(sql);
		query.addEntity(ProductDetails.class);
		query.setParameter("productId", productId);
		if (!CollectionUtils.isEmpty(query.getResultList())) {
			ProductDetails resultList = (ProductDetails) query.getResultList().get(0);
			resultList.setPrice(212);
			currentSession.save(resultList);
			return "Successful";
		}

		return "unsucessfull";
	}

	@Override
	public List<ProductDetails> viewInventoryByAllProduct() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<ProductDetails> theQuery = currentSession.createQuery("from ProductDetails order by ID",
				ProductDetails.class);
		List<ProductDetails> productDetails = theQuery.getResultList();
		return productDetails;

	}

}
