package com.codation.categoryandproduct.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Product {

	@Id
	@Column(name = "product_id")
	private int id;

	@Column(name = "product_Name")
	private String productdName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_foreign")
	private List<Product> products = new ArrayList();

	public Product() {
		super();
	}

	public Product(int id, String productdName) {
		super();
		this.id = id;
		this.productdName = productdName;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productdName=" + productdName + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductdName() {
		return productdName;
	}

	public void setProductdName(String productdName) {
		this.productdName = productdName;
	}

}
