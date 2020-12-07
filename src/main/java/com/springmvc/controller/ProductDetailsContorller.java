package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.entity.ProductDetails;
import com.springmvc.service.ProductDetailsService;

@Controller
@RequestMapping("/product")
public class ProductDetailsContorller {

	@Autowired
	private ProductDetailsService productDetailsService;
	
	@GetMapping("/getProductDeatilsByName")
	public String getProductDetailsByName(Model theModel, String productBrand) {
		List<ProductDetails> productDetailsName = productDetailsService.viewInventoryByProductBrand(productBrand);
		theModel.addAttribute("productDeailsByName", productDetailsName);
		return "list-product-name";
	}
	
	@PostMapping(path="/addCategory" , consumes = MediaType.APPLICATION_XML_VALUE)
	public String addProductDetails(@RequestBody ProductDetails productDeails ) {
		productDetailsService.addProdcutDetails(productDeails);	
		return "";
	}
	
	@GetMapping("/getProductDeatilsById")
	public String getProductDetailsById(Model theModel, Long productId) {
		ProductDetails productDetailsId = productDetailsService.viewInventoryByProductId(productId);
		theModel.addAttribute("productDeailsById", productDetailsId);
		return "list-product-Id";
	}
	
	@GetMapping("/getInventoryByAllProduct")
	public String viewInventoryByAllProduct(Model theModel) {
		List<ProductDetails> inventoryByAllProduct = productDetailsService.viewInventoryByAllProduct();
		theModel.addAttribute("inventoryByAllProduct",inventoryByAllProduct);
		return "list-all-product";
	}
	
	
	
}
