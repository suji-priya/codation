package com.codation.categoryandproduct.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product implements Serializable {

	@Id
	@Column(name = "product_id")
	private int id;

	@Column(name = "product_Name")
	private String productName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_foreign")
	private SubChildCategory subChildCategory;

	
	public SubChildCategory getSubChildCategory() {
		return subChildCategory;
	}

	public void setSubChildCategory(SubChildCategory subChildCategory) {
		this.subChildCategory = subChildCategory;
	}

	public Product() {
		super();
	}

	public Product(int id, String productdName) {
		super();
		this.id = id;
		this.productName = productdName;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productdName=" + productName + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
