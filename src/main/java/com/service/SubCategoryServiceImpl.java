package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SubCategoryDAO;
import com.entity.SubCategory;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {
	@Autowired
	private SubCategoryDAO subCategoryDAO;

	@Override
	@Transactional
	public void addSubCategory(SubCategory theSubCategory) {
		subCategoryDAO.addSubCategory(theSubCategory);
	}
}
