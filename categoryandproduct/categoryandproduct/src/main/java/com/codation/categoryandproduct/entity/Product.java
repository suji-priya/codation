package com.codation.categoryandproduct.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@Column(name = "product_id")
	private int id;

	@Column(name = "product_Name")
	private String productName;

	@ManyToOne(cascade = CascadeType.MERGE)
	private SubChildCategory subChildCategory;
   
	public SubChildCategory getSubChildCategory() {
		return subChildCategory;
	}

	public void setSubChildCategory(SubChildCategory subChildCategory) {
		this.subChildCategory = subChildCategory;
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

	

	public Product(int id, String productName, SubChildCategory subChildCategory) {
		super();
		this.id = id;
		this.productName = productName;
		this.subChildCategory = subChildCategory;
	}

	public Product() {
		super();
	}

}
