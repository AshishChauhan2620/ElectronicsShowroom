
package com.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SUB_CATEGORY")
public class SubCategory {

	@Id
	@Column(name = "SUB_CATEGORY_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subCategoryId;

	@Column(name = "SUB_CATEGORY_NAME")
	private String subCategoryName;

	@ManyToOne()
	@JoinColumn(name = "Category_Id")
	private Category categoryId;

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "SubCategory [subCategoryId=" + subCategoryId + ", subCategoryName=" + subCategoryName + ", categoryId="
				+ categoryId + "]";
	}

}
