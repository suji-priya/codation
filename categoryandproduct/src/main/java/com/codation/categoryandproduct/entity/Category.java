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
public class Category {

	@Id
	@Column(name = "category_Id")
	private int id;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="category_Foreign")
	private List<ChildCategory> childCategory = new ArrayList();

	public Category() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<ChildCategory> getChildCategory() {
		return childCategory;
	}

	public void setChildCategory(List<ChildCategory> childCategory) {
		this.childCategory = childCategory;
	}

	public Category(int id, List<ChildCategory> childCategory) {
		super();
		this.id = id;
		this.childCategory = childCategory;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", childCategory=" + childCategory + "]";
	}

}
