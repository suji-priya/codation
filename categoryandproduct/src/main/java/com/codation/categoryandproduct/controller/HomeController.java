package com.codation.categoryandproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codation.categoryandproduct.entity.Category;
import com.codation.categoryandproduct.entity.Product;
import com.codation.categoryandproduct.homeserviceimpl.ServiceImpl;

@RestController
@RequestMapping("/shopping")
public class HomeController {

	@Autowired
	ServiceImpl serviceImpl;
    
	@PostMapping("/category")
	public ResponseEntity<String> addCategory(@RequestBody Category theCategory) {

		if (theCategory != null) {

			String response = serviceImpl.addCategory(theCategory);
			return new ResponseEntity<String>(response, HttpStatus.CREATED);

		}
		return new ResponseEntity<String>("Category Details are Mandatory It Cannot Be Empty !",
				HttpStatus.BAD_REQUEST);

	}
    @GetMapping("/category")
	public ResponseEntity<Object> getCategories() {

		List<Category> categories = serviceImpl.getCategories();

		return new ResponseEntity<Object>(categories, HttpStatus.OK);

	}
    @PostMapping("/product")
	public ResponseEntity<String> addProduct(@RequestBody Product theProduct) {

		if (theProduct != null) {

			String response = serviceImpl.addProduct(theProduct);

			return new ResponseEntity<String>(response, HttpStatus.CREATED);

		}

		return new ResponseEntity<String>("Product Details are MandatoryIt Cannot Be Empty !", HttpStatus.BAD_REQUEST);

	}
    @GetMapping("/product/{name}")
	public ResponseEntity<Object> getProducts(@PathVariable("name") String cName) {

		List<Product> products = serviceImpl.getProducts(cName);

		return new ResponseEntity<Object>(products, HttpStatus.OK);

	}
    @PutMapping("/product")
	public ResponseEntity<String> updateProducts(@RequestBody Category theCategory) {

		String response = serviceImpl.updateProducts(theCategory);

		if (response != null) {

			return new ResponseEntity<String>(response, HttpStatus.OK);
		}

		return new ResponseEntity<String>("theCategory id=" + theCategory.getId() + "  not found", HttpStatus.NOT_FOUND);
	}

}
