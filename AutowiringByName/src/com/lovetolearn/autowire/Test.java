package com.lovetolearn.autowire;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
Employee e =(Employee)context.getBean("e");
System.out.println(e.toString());
	}

}
