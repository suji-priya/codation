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

	private String sub_ChildCategoryName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sub_ChildCategory")

	private List<Product> product = new ArrayList<Product>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSub_ChildCategoryName() {
		return sub_ChildCategoryName;
	}

	public void setSub_ChildCategoryName(String sub_ChildCategoryName) {
		this.sub_ChildCategoryName = sub_ChildCategoryName;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public SubChildCategory(int id, String sub_ChildCategoryName, List<Product> product) {
		super();
		this.id = id;
		this.sub_ChildCategoryName = sub_ChildCategoryName;
		this.product = product;
	}

	public SubChildCategory() {
		super();
	}

}
