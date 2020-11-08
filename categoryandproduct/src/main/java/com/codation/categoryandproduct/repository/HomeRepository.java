package com.codation.categoryandproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codation.categoryandproduct.entity.Category;

@Repository
public interface HomeRepository extends JpaRepository<Category, Integer> {

	
	
}
