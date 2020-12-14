package com.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.entity.ProductDetails;
import com.springmvc.service.ProductDetailsService;

@RestController
@RequestMapping("/productdetailsapi")
public class ProductDetailsController {

	@Autowired
	private ProductDetailsService productDetailsService;

	@GetMapping("/viewproductdeatilsbyname")
	public String getProductDetailsByName(Model theModel, String productBrand) {
		List<ProductDetails> productDetailsName = productDetailsService.viewInventoryByAllProduct();
		theModel.addAttribute("productDeailsByName", productDetailsName);
		return "list-product-name";
	}

	@PostMapping(path = "/addproductdetails", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductDetails addProductDetails(@RequestBody ProductDetails theProductDetails) {
		theProductDetails.setProductId(0);
		productDetailsService.addProductDetails(theProductDetails);
		return theProductDetails;
	}

	@GetMapping("/getproductdeatilsbyid")
	public String getProductDetailsById(Model theModel, int productId) {
		ProductDetails productDetailsId = productDetailsService.updateInventoryByProductId(productId);
		theModel.addAttribute("productDeailsById", productDetailsId);
		return "list-product-Id";
	}

	@GetMapping("/getinventorybyallproduct")
	public String viewInventoryByAllProduct(Model theModel) {
		List<ProductDetails> inventoryByAllProduct = productDetailsService.viewInventoryByAllProduct();
		theModel.addAttribute("inventoryByAllProduct", inventoryByAllProduct);
		return "list-all-product";
	}

}
