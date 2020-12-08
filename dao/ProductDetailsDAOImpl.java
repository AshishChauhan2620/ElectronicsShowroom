package com.springmvc.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

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
	public String updateProductDetailsByProductId(Long productId) {
		Session currentSession = sessionFactory.getCurrentSession();
		String sql = "SELECT * FROM PRODUCT_DETAILS WHERE PRODUCT_ID = :productId";
		SQLQuery query = currentSession.createSQLQuery(sql);
		query.addEntity(ProductDetails.class);
		query.setParameter("productId", productId);
		if (!CollectionUtils.isEmpty(query.getResultList())) {
			ProductDetails resultList = (ProductDetails) query.getResultList().get(0);
			resultList.setPrice(212l);
			currentSession.save(resultList);
			return "Successful";
		}

		return "unsucessfull";
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
		Session currentSession = sessionFactory.getCurrentSession();
		ProductDetails productDetailsId = currentSession.get(ProductDetails.class, productId);
		return productDetailsId;
	}

	@Override
	public List<ProductDetails> viewInventoryByAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
