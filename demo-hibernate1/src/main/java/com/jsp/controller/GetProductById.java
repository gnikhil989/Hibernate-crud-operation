package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class GetProductById {

	public static void main(String[] args) {

		ProductService productService = new ProductService();

		Product product = new Product();

		if (product != null) {

			System.out.println(product.getBrand());

			System.out.println(product.getName());

		}

		else {

			System.out.println("Incorrect Id");

		}

	}

}
