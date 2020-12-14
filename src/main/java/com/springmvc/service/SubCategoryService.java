
package com.springmvc.service;

import java.util.List;

import com.springmvc.entity.SubCategory;

public interface SubCategoryService {

	public void addSubCategory(SubCategory theSubCategory);

	public List<SubCategory> viewListOfSubCategory();
}
