package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.entity.Category;
import com.springmvc.service.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/getCategory")
	public String getCategory(Model theModel) {
		List<Category> theCategory = categoryService.viewListOfCategory();
		theModel.addAttribute("category", theCategory);
		return "list-category";
	}

	@PostMapping(path = "/addCategory", consumes = MediaType.APPLICATION_XML_VALUE)
	public String addCategory(@RequestBody Category category) {
		categoryService.addCategory(category);
		return "add-category";
	}

}
