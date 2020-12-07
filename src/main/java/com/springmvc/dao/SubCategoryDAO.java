package com.springmvc.dao;

import java.util.List;

import com.springmvc.entity.SubCategory;

public interface SubCategoryDAO {
	public void addSubCategory(SubCategory subCategory);

	public List<SubCategory> viewListOfSubCategory();
}
