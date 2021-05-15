package firstApplication;

import org.apache.log4j.BasicConfigurator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();//for printing logs
Resource resource = new  ClassPathResource("applicationContext.xml");

BeanFactory factory = new XmlBeanFactory(resource);
Student s = (Student)factory.getBean("student");
System.out.println(s.toString());
		
		
	
	}

}
