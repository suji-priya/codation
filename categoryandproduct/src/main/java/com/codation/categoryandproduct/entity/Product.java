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

	@ManyToOne(cascade = CascadeType.ALL)
	private SubChildCategory sub_ChildCategory;

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

	public SubChildCategory getSub_ChildCategory() {
		return sub_ChildCategory;
	}

	public void setSub_ChildCategory(SubChildCategory sub_ChildCategory) {
		this.sub_ChildCategory = sub_ChildCategory;
	}

	public Product(int id, String productName, SubChildCategory sub_ChildCategory) {
		super();
		this.id = id;
		this.productName = productName;
		this.sub_ChildCategory = sub_ChildCategory;
	}

	public Product() {
		super();
	}

}
