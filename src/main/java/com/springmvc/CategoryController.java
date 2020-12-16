package com.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.entity.Category;
import com.springmvc.service.CategoryService;

@RestController
@RequestMapping("/categoryapi")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/viewcategory")
	public List<Category> viewListOfCategory() {
		return categoryService.viewListOfCategory();
	}

	@PostMapping(value = "/addcategory", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Category addCategory(@RequestBody Category theCategory) {
		theCategory.setCategoryId(0);
		categoryService.addCategory(theCategory);
		return theCategory;
	}

	@GetMapping("/readExcelUpdateInDB")
	public void readExcelAndUpdateInDB() {
		Excel2DatabaseUtil.excelData();

	}

}
