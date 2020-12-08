package com.springmvc.service;

import java.util.List;

import com.springmvc.entity.Category;

public interface CategoryService {

	public void addCategory(Category theCategory);
	public List < Category > viewListOfCategory();
}
