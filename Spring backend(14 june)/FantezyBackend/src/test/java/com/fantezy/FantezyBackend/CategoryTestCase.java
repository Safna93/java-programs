package com.fantezy.FantezyBackend;

import javax.naming.Context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fantezy.FantezyBackend.dao.CategoryDAO;
import com.fantezy.FantezyBackend.model.Category;

public class CategoryTestCase 
{
	public static void main(String[] args) {
		
	
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
context.scan("com.fantezy.FantezyBackend");
context.refresh();
//Inserting a Category Object
/*CategoryDAO categoryDAO=(CategoryDAO)context.getBean("category");
Category category=new Category();
category.setCatname("Sarees");
category.setCatdesc("It looks beautiful");
//categoryDAO.insertCategory(category);
}*/
}
}
