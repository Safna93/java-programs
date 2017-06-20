package com.fantezy.FantezyBackend;

import javax.naming.Context;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fantezy.FantezyBackend.dao.CategoryDAO;
import com.fantezy.FantezyBackend.dao.ProductDAO;
import com.fantezy.FantezyBackend.model.Category;
import com.fantezy.FantezyBackend.model.Product;
public class MyProductTestCase 
{
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.fantezy.FantezyBackend");
	context.refresh();

ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");

	
Product product=new Product();

product.setProdName("Jeans");
product.setQuantity(3);
product.setProdDesc("Be Branded");

productDAO.insertUpdateProduct(product);		
System.out.println("product Inserted");

}
}
