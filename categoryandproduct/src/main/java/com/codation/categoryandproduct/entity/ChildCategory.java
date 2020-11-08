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
public class ChildCategory {

	@Id
	@Column(name = "childCategory_Id")
	private int id;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="childCategory_foreign")
	private List<SubCategory> subChildCategory = new ArrayList();

	
	public ChildCategory() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<SubCategory> getSubChildCategory() {
		return subChildCategory;
	}

	public void setSubChildCategory(List<SubCategory> subChildCategory) {
		this.subChildCategory = subChildCategory;
	}
	
	
    
	
}
