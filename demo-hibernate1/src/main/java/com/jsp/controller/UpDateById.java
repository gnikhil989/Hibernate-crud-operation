package com.jsp.controller;

import com.jsp.dao.ProductDao;
import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class UpDateById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService productService=new ProductService();
		Product product=productService.updateProductName(4, "nikhil");
		System.out.println(product.getName());
		

	}

}
