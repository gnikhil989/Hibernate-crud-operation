package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class GetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService productService=new ProductService();
		List<Product> products= productService.getAllProducts();
		for (Product p : products) {
			System.out.println(p.getId());
			System.out.println(p.getName());
System.out.println(p.getBrand());
System.out.println("==============================================");
		}
	}

}
