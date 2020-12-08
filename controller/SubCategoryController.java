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

import com.springmvc.entity.SubCategory;
import com.springmvc.service.SubCategoryService;

@Controller
@RequestMapping("/subCategory")
public class SubCategoryController {

	@Autowired
	private SubCategoryService subCategoryService;

	@GetMapping("/getCategory")
	public String getCategories(Model theModel) {
		List<SubCategory> theSubcategory = subCategoryService.viewListOfSubCategory();
		theModel.addAttribute("subCategory", theSubcategory);
		return "list-customers";
	}

	@PostMapping(path = "/addSubCategory", consumes = MediaType.APPLICATION_XML_VALUE)
	public String addCategory(@RequestBody SubCategory subCategory) {
		subCategoryService.addSubCategory(subCategory);
		return "add-sub-category";
	}

}
