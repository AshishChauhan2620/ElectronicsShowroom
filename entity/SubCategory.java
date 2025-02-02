package com.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SUB_CATEGORY")
public class SubCategory {
	@Id
	@Column(name = "SUB_CATEGORY_ID")
	private Long subCategoryId;
	@Column(name = "SUB_CATEGORY_NAME")
	private String subCategoryName;
	@ManyToOne()
	@JoinColumn(name = "CATEGORY_ID")
	private Category categoryId;

	public Long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

}
