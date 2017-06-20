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


//Retrieval TestCase

		/*Supplier supplier=supplierDAO.getSupplier(2);
		System.out.println("Supplier Name:"+supplier.getCatname());
		System.out.println("Supplier Description:"+supplier.getCatdesc());
		
		//Deletion TestCase
		Supplier supplier=supplierDAO.getSupplier(2);
		supplierDAO.deleteSupplier(supplier);
		System.out.println("The Supplier Deleted");
		
		//Retrieving the Data
		
		List<Supplier> list=supplierDAO.getSupplierDetails();
		
		for(Supplier supplier:list)
		{
			System.out.println(supplier.getCatid()+":"+supplier.getCatname()+":"+supplier.getCatdesc());
		}
		
		//Update the Supplier
		Supplier supplier=supplierDAO.getSupplier(1);
		supplier.setCatname("WifiEnMobile");
		supplierDAO.insertUpdateSupplier(supplier);
		System.out.println("The Supplier Updated");*/
		
	
}
}
