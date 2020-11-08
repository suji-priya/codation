package com.codation.categoryandproduct.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@Column(name = "category_Id")
	private int id;

	private String category_Name;

	@OneToMany(cascade = CascadeType.ALL)
	private List<ChildCategory> childCategory = new ArrayList<ChildCategory>();
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory_Name() {
		return category_Name;
	}

	public void setCategory_Name(String category_Name) {
		this.category_Name = category_Name;
	}

	public List<ChildCategory> getChildCategory() {
		return childCategory;
	}

	public void setChildCategory(List<ChildCategory> childCategory) {
		this.childCategory = childCategory;
	}

	/*
	 * public Category(int id, String category_Name, List<ChildCategory>
	 * childCategory) {
	 * 
	 * this.id = id; this.category_Name = category_Name; this.childCategory =
	 * childCategory; }
	 * 
	 * public Category() { super(); }
	 */

}
