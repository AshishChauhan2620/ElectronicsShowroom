package com.springmvc.dao;

import java.util.List;

import com.springmvc.entity.ProductDetails;

public interface ProductDetailsDAO {

	public void addProductDetails(ProductDetails theProductDetails);

	public List<ProductDetails> viewInventoryByAllProduct();

	public String updateProductDetailsByProductId(int productId);
	
}
