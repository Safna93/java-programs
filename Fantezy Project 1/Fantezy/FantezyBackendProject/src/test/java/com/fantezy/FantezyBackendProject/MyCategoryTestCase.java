package com.fantezy.FantezyBackendProject;

import java.util.List;

import javax.naming.Context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fantezy.FantezyBackendProject.dao.CategoryDAO;
import com.fantezy.FantezyBackendProject.model.Category;

public class MyCategoryTestCase {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.fantezy.FantezyBackendProject");
		context.refresh();

		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		
		// insert

		Category category = new Category();

		category.setCatname("Saree");
		category.setCatdesc("Wear and be Gorgeous");

		categoryDAO.insertUpdateCategory(category);
		System.out.println("Category Inserted");
		
		
		//Retrieval TestCase
		
				/*Category category=categoryDAO.getCategory(2);
				System.out.println("Category Name:"+category.getCatname());
				System.out.println("Category Description:"+category.getCatdesc());
				
				//Deletion TestCase
				Category category=categoryDAO.getCategory(2);
				categoryDAO.deleteCategory(category);
				System.out.println("The Category Deleted");
				
				//Retrieving the Data
				
				List<Category> list=categoryDAO.getCategoryDetails();
				
				for(Category category:list)
				{
					System.out.println(category.getCatid()+":"+category.getCatname()+":"+category.getCatdesc());
				}
				
				//Update the Category
				Category category=categoryDAO.getCategory(1);
				category.setCatname("WifiEnMobile");
				categoryDAO.insertUpdateCategory(category);
				System.out.println("The Category Updated");*/
				
			
		
	}
}
