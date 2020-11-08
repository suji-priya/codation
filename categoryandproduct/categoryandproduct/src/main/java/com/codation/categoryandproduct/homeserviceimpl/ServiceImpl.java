package com.codation.categoryandproduct.homeserviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codation.categoryandproduct.entity.Category;
import com.codation.categoryandproduct.entity.Product;
import com.codation.categoryandproduct.homeservice.HomeService;
import com.codation.categoryandproduct.repository.CategoryRepository;
import com.codation.categoryandproduct.repository.ProductRepository;

@Service
public class ServiceImpl implements HomeService {

	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	ProductRepository productRepository;

	@Override
	public String addCategory(Category theCategory) {

		categoryRepository.save(theCategory);

		return "Category Added Successfully";
	}

	@Override
	public List<Category> getCategories() {

		return categoryRepository.findAll();
	}

	@Override
	public String addProduct(Product theProduct) {

		productRepository.save(theProduct);

		return "Product Added Successfully";
	}

	@Override
	public List<Product> getProducts(String cName) {

		return productRepository.findAllProduct(cName);
	}

	@Override
	public String updateProducts(Product theProduct) {

		Optional<Product> product = productRepository.findById(theProduct.getId());
		if (product.isPresent()) {

			productRepository.save(theProduct);

			return "Product Updated Successfully !";
		}
		return null;
	}

}
