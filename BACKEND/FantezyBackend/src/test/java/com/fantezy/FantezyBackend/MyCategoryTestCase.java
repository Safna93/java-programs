package com.fantezy.FantezyBackend;

import javax.naming.Context;




import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fantezy.FantezyBackend.dao.CategoryDAO;
import com.fantezy.FantezyBackend.model.Category;

public class MyCategoryTestCase 
{
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.fantezy.FantezyBackend");
	context.refresh();

CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");

	
Category category=new Category();

category.setCatname("Saree");
category.setCatdesc("Wear and be Gorgeous");

categoryDAO.insertUpdateCategory(category);		
System.out.println("Category Inserted");

}
}
