package com.jsp.controller;

import com.jsp.service.ProductService;

public class DeleteProductById {

	public static void main(String[] args) {

		ProductService productService = new ProductService();

		boolean flag = productService.deleteProductById(1);

		if (flag == true) {

			System.out.println("Product Deleted");

		}

		else {

			System.out.println("Product Not Deleted");

		}

	}

}
