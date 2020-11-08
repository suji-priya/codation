package com.codation.categoryandproduct.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SubChildCategory {
	@Id
	@Column(name = "subCategory_Id")
	private int id;

	private String subChildCategoryName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "subChildCategory")
    
	private List<Product> product = new ArrayList<Product>();
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubChildCategoryName() {
		return subChildCategoryName;
	}

	public void setSubChildCategoryName(String subChildCategoryName) {
		this.subChildCategoryName = subChildCategoryName;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public SubChildCategory(int id, String subChildCategoryName, List<Product> product) {
		super();
		this.id = id;
		this.subChildCategoryName = subChildCategoryName;
		this.product = product;
	}

	public SubChildCategory() {
		super();
	}

}
