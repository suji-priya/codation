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
public class SubChildCategory {
	@Id
	@Column(name = "subCategory_Id")
	private int id;
    
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "subChildCategory")
	
	private List<Product> product = new ArrayList();
	
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SubChildCategory() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "SubCategory [id=" + id + ", product=" + product + "]";
	}

	public SubChildCategory(int id, List<Product> product) {
		super();
		this.id = id;
		this.product = product;
	}

	
}
