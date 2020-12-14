package com.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.ProductDetailsDAO;
import com.springmvc.entity.ProductDetails;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {
	@Autowired
	private ProductDetailsDAO productDetailsDAO;

	@Override
	@Transactional
	public void addProductDetails(ProductDetails theProductDetails) {
		productDetailsDAO.addProductDetails(theProductDetails);
	}

	@Override
	@Transactional
	public List<ProductDetails> viewInventoryByAllProduct() {
		return productDetailsDAO.viewInventoryByAllProduct();

	}

	@Override
	public ProductDetails updateInventoryByProductId(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
