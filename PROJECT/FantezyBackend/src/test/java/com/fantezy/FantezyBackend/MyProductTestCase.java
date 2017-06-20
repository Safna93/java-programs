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

//Retrieval TestCase

/*Product product=productDAO.getProduct(2);
System.out.println("Product Name:"+product.getCatname());
System.out.println("Product Description:"+product.getCatdesc());

//Deletion TestCase
Product product=productDAO.getProduct(2);
productDAO.deleteProduct(product);
System.out.println("The Product Deleted");

//Retrieving the Data

List<Product> list=productDAO.getProductDetails();

for(Product product:list)
{
	System.out.println(product.getCatid()+":"+product.getCatname()+":"+product.getCatdesc());
}

//Update the Product
Product product=productDAO.getProduct(1);
product.setCatname("Shirt");
productDAO.insertUpdateProduct(product);
System.out.println("The Product Updated");*/

}
}
