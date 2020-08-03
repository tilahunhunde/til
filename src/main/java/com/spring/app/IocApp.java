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
//		Resource res = new FileSystemResource("src/main/resources/beans.xml");
//		XmlBeanFactory appCtx = new XmlBeanFactory(res);
		
//		ApplicationContext appCtx = new FileSystemXmlApplicationContext
//		("C:\\Eclipse\\CognizantSpringW2\\SpringDI\\src\\main\\resources\\beans.xml");
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans.xml");
		
//		ApplicationContext appCtx = new ClassPathXmlApplicationContext(new String[] {"beans.xml", "SpringBeans.xml"});

		User user1 = (User) appCtx.getBean("usr1Obj");  // IOC
		System.out.println("User1 Id: " + user1.getUserId());
		System.out.println("User1 Name: " + user1.getName());
		System.out.println("User1 City: " + user1.getCity());
	
		User user2 = (User) appCtx.getBean("usr2Obj");  // IOC
		System.out.println("User2 Id: " + user2.getUserId());
		System.out.println("User2 Name: " + user2.getName());
		System.out.println("User2 City: " + user2.getCity());
	
		User user3 = (User) appCtx.getBean("usr1Obj");  // IOC

		user3.setName("Rajesh");
		System.out.println("NEw user1 name : " + user1.getName());
		System.out.println("New user3 name : " + user3.getName());
		
		Department dept = (Department) appCtx.getBean("dept");
		System.out.println("DEPARTMENT NAME : " + dept.getDepartment());
		System.out.println("CUSTOMER NAME : " + dept.getCustomer().getName());
		
		Department dept2 = (Department) appCtx.getBean("dept");
		
		dept2.setDepartment("Service");
		dept2.getCustomer().setName("Reena");
		
		System.out.println("DEPARTMENT NAME : " + dept.getDepartment());
		System.out.println("CUSTOMER NAME : " + dept.getCustomer().getName());
		
		System.out.println("DEPARTMENT NAME : " + dept2.getDepartment());
		System.out.println("CUSTOMER NAME : " + dept2.getCustomer().getName());
		
		
		
	}
}
 