package com.fantezy.FantezyBackend;

import javax.naming.Context;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fantezy.FantezyBackend.dao.UserDAO;
import com.fantezy.FantezyBackend.model.User;

public class UserTestCase 
{
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.fantezy.FantezyBackend");
	context.refresh();

UserDAO userDAO=(UserDAO)context.getBean("userDAO");

	
User user=new User();


user.setPassword("Safna123");
user.setCustomerName("Aruna");	
user.setRole("");
user.setEnabled(null);
user.setEmail("safna");
user.setAddress("Chennai");
user.setMobile(123456);

userDAO.insertUpdateUser(user);		
System.out.println("User Inserted");


//Retrieval TestCase

		/*User user=userDAO.getUser(2);
		System.out.println("User Name:"+user.getCatname());
		System.out.println("User Description:"+user.getCatdesc());
		
		//Deletion TestCase
		User user=userDAO.getUser(2);
		userDAO.deleteUser(user);
		System.out.println("The User Deleted");
		
		//Retrieving the Data
		
		List<User> list=userDAO.getUserDetails();
		
		for(User user:list)
		{
			System.out.println(user.getCatid()+":"+user.getCatname()+":"+user.getCatdesc());
		}
		
		//Update the User
		User user=userDAO.getUser(1);
		user.setCatname("pants");
		userDAO.insertUpdateUser(user);
		System.out.println("The User Updated");*/
		
	
}
}
