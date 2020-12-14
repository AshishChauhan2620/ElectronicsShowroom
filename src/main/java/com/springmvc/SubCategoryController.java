
package com.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.entity.SubCategory;
import com.springmvc.service.SubCategoryService;

@RestController

@RequestMapping("/subcategoryapi")
public class SubCategoryController {

	@Autowired
	private SubCategoryService subCategoryService;

	@GetMapping("/viewsubcategory")
	public List<SubCategory> viewlistOfSubCategory() {
		return subCategoryService.viewListOfSubCategory();
	}

	@PostMapping(path = "/addsubcategory", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public SubCategory addSubCategory(@RequestBody SubCategory subCategory) { //
		subCategory.setSubCategoryId(0);
		subCategoryService.addSubCategory(subCategory);
		return subCategory;
	}

}
