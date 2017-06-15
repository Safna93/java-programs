package com.fantezy.FantezyBackend.dao;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fantezy.FantezyBackend.model.Category;

@Repository("categoryDAO")
public class CategoryDAO
{
@ Autowired  
SessionFactory sessionFactory;
public CategoryDAO(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
}
/*public void insertCategory(Category category)
{
	sessionFactory.getCurrentSession().saveOrUpdate(category);
}*/

}
