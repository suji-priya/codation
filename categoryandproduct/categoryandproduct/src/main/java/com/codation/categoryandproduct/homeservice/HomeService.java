package com.codation.categoryandproduct.homeservice;

import java.util.List;

import com.codation.categoryandproduct.entity.Category;
import com.codation.categoryandproduct.entity.Product;

public interface HomeService {

	String addCategory(Category theCategory);

	List<Category> getCategories();

	List<Product> getProducts(String cName);

	String updateProducts(Product theProduct);

	String addProduct(Product theProduct);

}
