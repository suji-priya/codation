package com.codation.categoryandproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codation.categoryandproduct.entity.SubChildCategory;

@Repository
public interface SubChildCategoryRepository extends JpaRepository<SubChildCategory, Integer>{
	
	
	public SubChildCategory findBySubChildCategoryName(String cName);

}
