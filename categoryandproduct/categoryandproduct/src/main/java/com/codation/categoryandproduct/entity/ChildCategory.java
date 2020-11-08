package com.codation.categoryandproduct.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ChildCategory {

	@Id
	@Column(name = "childCategory_Id")
	private int id;
	
	private String child_CategoryName;
     
	@OneToMany(cascade = CascadeType.ALL)
	private List<SubChildCategory> sub_ChildCategory = new ArrayList();
    
	
	public String getChild_CategoryName() {
		return child_CategoryName;
	}

	public List<SubChildCategory> getSub_ChildCategory() {
		return sub_ChildCategory;
	}

	public ChildCategory() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<SubChildCategory> getSubChildCategory() {
		return sub_ChildCategory;
	}

	public void setSubChildCategory(List<SubChildCategory> subChildCategory) {
		this.sub_ChildCategory = subChildCategory;
	}

	/*
	 * public ChildCategory(int id, String child_CategoryName,
	 * List<SubChildCategory> sub_ChildCategory) { super(); this.id = id;
	 * this.child_CategoryName = child_CategoryName; this.sub_ChildCategory =
	 * sub_ChildCategory; }
	 */

	
	
    
	
}
