package com.codation.categoryandproduct.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.codation.categoryandproduct.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("select p.productName from Product p where p.subChildCategory.name=?1")
	public List<Product> getAllProduct(String name);
}
