package com.springmvc.dao;

import java.util.List;

import com.springmvc.entity.Category;

public interface CategoryDAO {
	public void addCategory(Category theCategory);

	public List<Category> viewListOfCategory();
}
