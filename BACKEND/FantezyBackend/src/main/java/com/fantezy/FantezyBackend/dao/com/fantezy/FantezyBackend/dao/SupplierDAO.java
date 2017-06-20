package com.fantezy.FantezyBackend.dao;

import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fantezy.FantezyBackend.model.Supplier;

@Repository("SupplierDAO")
	public class SupplierDAO 
	{
	@Autowired
	SessionFactory sessionFactory;
	public SupplierDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public void insertUpdateSupplier(Supplier supplier)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(supplier);
	}

	public Supplier getSupplier(int suppid)
	{
		Session session=sessionFactory.openSession();
		Supplier supplier=(Supplier)session.get(Supplier.class,suppid);
		session.close();
		return supplier;
	}


	}


