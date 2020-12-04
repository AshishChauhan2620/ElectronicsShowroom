package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.ProductDetails;
import com.service.ProductDetailsService;
@Controller
@RequestMapping("/productdetails")
public class ProductDetailsController {
	@Autowired
	private ProductDetailsService productDetailsService;

	@PostMapping("/addProductDetails")
	public String addProdcutDetails(@ModelAttribute("productdetails") ProductDetails theProductDetails) {
		productDetailsService.addProdcutDetails(theProductDetails);
		return "productDetails";
	}
}
