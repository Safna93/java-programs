package com.fantezy.FantezyBackend.dao;
import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fantezy.FantezyBackend.model.*;
@Repository("userDAO")
public class UserDAO 
{
@Autowired
SessionFactory sessionFactory;
public UserDAO(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
}
@Transactional
public void insertUpdateUser(User user)
{
	Session session=sessionFactory.getCurrentSession();
	session.saveOrUpdate(user);
}

public User getUser(String UserName)
{
	Session session=sessionFactory.openSession();
	User user=(User)session.get(User.class,UserName);
	session.close();
	return user;
}


}
