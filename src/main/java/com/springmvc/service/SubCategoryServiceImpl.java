
package com.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.SubCategoryDAO;
import com.springmvc.entity.SubCategory;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

	@Autowired
	private SubCategoryDAO subCategoryDAO;

	@Override
	@Transactional
	public void addSubCategory(SubCategory theSubCategory) {
		subCategoryDAO.addSubCategory(theSubCategory);
	}

	@Override
	@Transactional
	public List<SubCategory> viewListOfSubCategory() {
		return subCategoryDAO.viewListOfSubCategory();
	}
}
