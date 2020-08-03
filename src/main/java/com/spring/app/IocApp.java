package com.spring.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.spring.bean.Department;
import com.spring.bean.User;

public class IocApp {
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans.xml");
		
		User user1 = (User) appCtx.getBean("usr1Obj");  // IOC
		System.out.println("User1 Id: " + user1.getUserId());
		System.out.println("User1 Name: " + user1.getName());
		System.out.println("User1 City: " + user1.getCity());	
	}
}
 