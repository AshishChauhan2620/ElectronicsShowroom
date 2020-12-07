package com.springmvc.service;

import java.util.List;

import com.springmvc.entity.ProductDetails;

public interface ProductDetailsService {

	public void addProdcutDetails(ProductDetails theProductDetails);

	public List<ProductDetails> viewInventoryByProductBrand(String productBrand);

	public ProductDetails viewInventoryByProductId(Long productId);

	public List<ProductDetails> viewInventoryByAllProduct();


}
