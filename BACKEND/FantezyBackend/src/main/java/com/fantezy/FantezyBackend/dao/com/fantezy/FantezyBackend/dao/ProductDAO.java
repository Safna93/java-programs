package com.fantezy.FantezyBackend.dao;
import javax.transaction.Transactional;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fantezy.FantezyBackend.model.*;
@Repository("productDAO")
public class ProductDAO 
{
@Autowired
SessionFactory sessionFactory;
public ProductDAO(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
}
@Transactional
public void insertUpdateProduct(Product product)
{
	Session session=sessionFactory.getCurrentSession();
	session.saveOrUpdate(product);
}

public Product getProduct(int ProdId)
{
	Session session=sessionFactory.openSession();
	Product product=(Product)session.get(Product.class,ProdId);
	session.close();
	return product;
}


}
