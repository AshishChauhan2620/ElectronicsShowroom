package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.SubCategory;
import com.service.SubCategoryService;

@Controller
@RequestMapping("/subcategory")
public class SubCategoryController {
	@Autowired
	private SubCategoryService subCategoryService;

	@PostMapping("/addSubCategory")
	public String addSubCategory(@ModelAttribute("subcategory") SubCategory theSubCategory) {
		subCategoryService.addSubCategory(theSubCategory);
		return "subcategorypage";
	}

}
