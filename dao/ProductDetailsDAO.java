package com.springmvc.dao;

import java.util.List;

import com.springmvc.entity.ProductDetails;

public interface ProductDetailsDAO {

	public void addProdcutDetails(ProductDetails theProductDetails);

	public List<ProductDetails> viewInventoryByProductBrand(String productBrand);

	public ProductDetails viewInventoryByProductId(Long productId);

	public List<ProductDetails> viewInventoryByAllProduct();

	public String updateProductDetailsByProductId(Long productId);
}
