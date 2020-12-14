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
@Table(name = "PRODUCT_DETAILS")
public class ProductDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_ID")
	private int productId;

	@Column(name = "BRAND")
	private String brand;

	@Column(name = "PRICE")
	private int price;

	@Column(name = "YEAR_OF_MANUFACTURING")
	private int yearOfManufacturing;

	@ManyToOne()
	@JoinColumn(name = "CATEGORY_ID")
	private Category categoryId;
	
	@ManyToOne()
	@JoinColumn(name = "SUB_CATEGORY_ID")
	private Category subCategoryId;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYearOfManufacturing() {
		return yearOfManufacturing;
	}

	public void setYearOfManufacturing(int yearOfManufacturing) {
		this.yearOfManufacturing = yearOfManufacturing;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}

	public Category getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Category subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", brand=" + brand + ", price=" + price
				+ ", yearOfManufacturing=" + yearOfManufacturing + ", subCategoryId=" + subCategoryId + ", categoryId="
				+ categoryId + "]";
	}

}
