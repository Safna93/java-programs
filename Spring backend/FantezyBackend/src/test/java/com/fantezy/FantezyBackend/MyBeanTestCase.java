package com.fantezy.FantezyBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBeanTestCase
{
	public static void main(String[] args)
	{
		System.out.println("---TestCase - Annotationconfiguration created");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		System.out.println("Scan method called");
		context.scan("com.fantezy.FantezyBackend");
		
		System.out.println("Refresh method called");
		context.refresh();
		
		System.out.println("my bean created");
		
		MyBean myBean=(MyBean)context.getBean("myBean");
		myBean.display();
	}

}
