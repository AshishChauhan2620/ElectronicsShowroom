package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDetailsDAO;
import com.entity.ProductDetails;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {
	@Autowired
	private ProductDetailsDAO productDetailsDAO;

	@Override
	@Transactional
	public void addProdcutDetails(ProductDetails theProductDetails) {
		productDetailsDAO.addProdcutDetails(theProductDetails);
	}
}
