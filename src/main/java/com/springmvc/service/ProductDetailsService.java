package com.springmvc.service;

import java.util.List;

import com.springmvc.entity.ProductDetails;

public interface ProductDetailsService {

	public void addProductDetails(ProductDetails theProductDetails);

	public List<ProductDetails> viewInventoryByAllProduct();

	public ProductDetails updateInventoryByProductId(int productId);

}
