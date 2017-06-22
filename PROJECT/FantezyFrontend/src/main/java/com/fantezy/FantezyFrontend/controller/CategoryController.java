package com.fantezy.FantezyFrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fantezy.FantezyBackend.dao.CategoryDAO;
import com.fantezy.FantezyBackend.model.Category;

@Controller
public class CategoryController 
{

	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/Category")
	public String showCategoryPage(Model m)
	{
		System.out.println("---Category Page Displaying-----");
		List<Category>list=categoryDAO.getCategoryDetails();
		m.addAttribute("catdetail", list);
		
		boolean flag=false;
		m.addAttribute("flag",flag);
		
		return "Category";
	}

	//ADD CATEGORY
	@RequestMapping(value="/AddCategory",method=RequestMethod.POST)
	public String addCategory(@RequestParam("catname") String catname,@RequestParam("catdesc") String catdesc,Model m)
	{
		System.out.println("---Add Category Starting-----");
		
		System.out.println(catname+":::"+catdesc);
		
		Category category=new Category();
		category.setCatname(catname);
		category.setCatdesc(catdesc);
		
		categoryDAO.insertUpdateCategory(category);
		
		List<Category> list=categoryDAO.getCategoryDetails();
		
		m.addAttribute("catdetail",list);
		
		System.out.println("---Category Added----");
		return "Category";
	}
	
	//DELETE CATEGORY	
	@RequestMapping(value="/deletecategory/{catid}")
	public String deleteCategory(@PathVariable("catid") int catid,Model m)
{
    System.out.println("Category Deleted");
    Category category=categoryDAO.getCategory(catid);
    categoryDAO.deleteCategory(category);
    
    List<Category> list=categoryDAO.getCategoryDetails();
    m.addAttribute("catdetail",list);
	return "Category";
	
}
@RequestMapping(value="/updateCategory/{catid}")
public String getUpdateCategory(@PathVariable("catid") int catid,Model m)
{
System.out.println("Getting Category object to be updated");

Category category=categoryDAO.getCategory(catid);
m.addAttribute("category",category);

List<Category> list=categoryDAO.getCategoryDetails();
m.addAttribute("catdetail",list);

boolean flag=true;
m.addAttribute("flag",flag);


return "Category";

}
@RequestMapping(value="/UpdateCategory",method=RequestMethod.POST)
public String updateCategory(@RequestParam("catid")int catid,@RequestParam("catname") String catname,@RequestParam("catdesc") String catdesc)
{
	return "Category";
}
}
	
	
