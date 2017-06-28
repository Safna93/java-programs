package com.fantezy.FantezyBackend;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
@Configuration
public class MyConfiguration 
{
@Bean("myBean")
public MyBean getMyBean()
{
	System.out.println("Bean created and stored in ioc");
	return new MyBean();
}

}
