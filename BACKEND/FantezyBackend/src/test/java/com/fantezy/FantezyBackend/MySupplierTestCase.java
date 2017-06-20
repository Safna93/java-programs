package com.fantezy.FantezyBackend;

import javax.naming.Context;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fantezy.FantezyBackend.dao.SupplierDAO;

import com.fantezy.FantezyBackend.model.Supplier;

public class MySupplierTestCase 
{
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.fantezy.FantezyBackend");
	context.refresh();

SupplierDAO SupplierDAO=(SupplierDAO)context.getBean("SupplierDAO");

	
Supplier Supplier=new Supplier();

Supplier.setSuppname("Ananth");
Supplier.setSuppaddress("Chennai");

SupplierDAO.insertUpdateSupplier(Supplier);		
System.out.println("Supplier Inserted");

}
}
