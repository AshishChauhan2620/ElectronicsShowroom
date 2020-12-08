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
	public void addProdcutDetails(ProductDetails theProductDetails) {
		productDetailsDAO.addProdcutDetails(theProductDetails);
	}

	@Override
	@Transactional
	public List<ProductDetails> viewInventoryByProductBrand(String productBrand) {
		return productDetailsDAO.viewInventoryByProductBrand(productBrand);

	}

	@Override
	public ProductDetails viewInventoryByProductId(Long productId) {
		return productDetailsDAO.viewInventoryByProductId(productId);
	}

	@Override
	public List<ProductDetails> viewInventoryByAllProduct() {
		return productDetailsDAO.viewInventoryByAllProduct();
	}

}
