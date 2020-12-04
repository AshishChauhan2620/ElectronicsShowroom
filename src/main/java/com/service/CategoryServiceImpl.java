package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CategoryDAO;
import com.entity.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDAO categoryDAO;

	@Override
	@Transactional
	public void addCategory(Category theCategory) {
		categoryDAO.addCategory(theCategory);
	}

}
