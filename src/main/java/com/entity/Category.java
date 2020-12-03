package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category {
	@Id
	@Column(name = "CATEGORY_ID")
	private Long categoryId;
	@Column(name = "CATEGORY_NAME")
	private String categoryName;
	@OneToMany(mappedBy = "categoryId")

	private List<SubCategory> subCategoryId;

	public List<SubCategory> getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(List<SubCategory> subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
