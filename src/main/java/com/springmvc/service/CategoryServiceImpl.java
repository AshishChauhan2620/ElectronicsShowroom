package com.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.CategoryDAO;
import com.springmvc.entity.Category;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDAO categoryDAO;

	@Override
	public void addCategory(Category theCategory) {
		categoryDAO.addCategory(theCategory);
	}

	@Override
	public List<Category> viewListOfCategory() {
		return categoryDAO.viewListOfCategory();
	}
}
