package com.codation.categoryandproduct.homeserviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codation.categoryandproduct.entity.Category;
import com.codation.categoryandproduct.homeservice.HomeService;
import com.codation.categoryandproduct.repository.HomeRepository;

@Service
public class ServiceImpl implements HomeService {

	@Autowired
	HomeRepository homeRepository;

	@Override
	public String addCategory(Category theCategory) {

		homeRepository.save(theCategory);

		return "Category Added Successfully";
	}

	@Override
	public List<Category> getCategories() {

		return homeRepository.findAll();
	}

	@Override
	public String addProduct(Category theProduct) {

		homeRepository.save(theProduct);

		return "Product Added Successfully";
	}

	@Override
	public List<Category> getProducts() {

		return homeRepository.findAll();
	}

	@Override
	public String updateProducts(Category theCategory) {

		Optional<Category> category = homeRepository.findById(theCategory.getId());
		if (category.isPresent()) {
			homeRepository.save(theCategory);

			return "Product Updated Successfully !";
		}
		return null;
	}

}
