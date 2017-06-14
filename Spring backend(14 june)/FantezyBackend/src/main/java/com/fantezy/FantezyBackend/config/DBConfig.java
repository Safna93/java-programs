package com.fantezy.FantezyBackend.config;

import java.util.Properties;


import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;   
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import com.fantezy.FantezyBackend.dao.CategoryDAO;
import com.fantezy.FantezyBackend.model.Category;

@Configuration
@ComponentScan("com.fantezy.FantezyBackend")
public class DBConfig 
{


@Bean(name="dataSource")

public DataSource getDataSource()
{   System.out.println("Data source creation");
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:~/test");
	dataSource.setUsername("sa");
	dataSource.setPassword("safna123");
	System.out.println("Data Source Created");
	return dataSource;
}
@Bean(name="sessionFactory")
public SessionFactory getSessionFactory(DataSource dataSource)
{
	System.out.println("---Hibernate Properties---");
	Properties prop=new Properties();
	prop.setProperty("hibernate.hbm2ddl.auto","update");
	prop.put("hibernate.show_sql","true");//optional
	prop.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
	System.out.println("---hibernate properties created---");
	System.out.println("---LolcalSessionfactory Builder Object created---");
	LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);
	sessionBuilder.setProperties(prop);
	System.out.println("Factory builder object created");
	sessionBuilder.addAnnotatedClass(Category.class);
	System.out.println("Session Factory object creation");
	SessionFactory sessionFactory=sessionBuilder.buildSession;
	System.out.println("Session Factory object created");
	
	return sessionBuilder.buildSessionFactory();
}
@Bean(name="txManager")
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
{
	HibernateTransactionManager transactionManager=new HibernateTransactionManager();
	return transactionManager;
	
}

@Bean(name="categoryDAO")
public CategoryDAO getCategoryDAO(SessionFactory sessionFactory) 
{
	return new  CategoryDAO(sessionFactory);
}

}
