package com.lovetolearn.ioc;

import org.apache.log4j.BasicConfigurator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

Resource resource = new  ClassPathResource("applicationContext.xml");
//
BeanFactory factory = new XmlBeanFactory(resource);
		//Employee e = (Employee)context.getBean("emp");
		Employee e = (Employee)factory.getBean("emp");
		System.out.println(e.toString());
	}

}
