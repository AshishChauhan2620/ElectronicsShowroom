package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Category;
import com.service.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@PostMapping("/addCategory")
	public String addCategory(@ModelAttribute("category") Category theCategory) {
		categoryService.addCategory(theCategory);
		return "index";
	}

}
