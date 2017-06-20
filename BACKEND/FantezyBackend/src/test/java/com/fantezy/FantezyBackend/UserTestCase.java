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


}
}
