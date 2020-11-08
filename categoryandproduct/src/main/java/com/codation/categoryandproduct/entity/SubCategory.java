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
public class SubCategory {
	@Id
	@Column(name = "subCategory_Id")
	private int id;
    
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="subCategory_fireign")
	private List<Product> product = new ArrayList();
	

	public SubCategory() {
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

	public SubCategory(int id, List<Product> product) {
		super();
		this.id = id;
		this.product = product;
	}

	
}
