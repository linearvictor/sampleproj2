package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.beans.AboutUs;
import com.beans.Address;
import com.beans.Home;
import com.beans.Student;
import com.beans.WebsiteCounter;

@SuppressWarnings("deprecation")
public class MainClass {

	public static void main(String[] args) {
		
//		Resource resource = new  FileSystemResource("src/com/ecom/cfgs/metadata.xml");
//		BeanFactory beanFactory= new XmlBeanFactory(resource);
		
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/com/ecom/cfgs/metadata.xml");
		
//		Student student=beanFactory.getBean("st1",Student.class);
//		Student student1=beanFactory.getBean("st2",Student.class);
//		System.out.println(student);
//		System.out.println(student.getAddress());
//		System.out.println(student.getMobile().length);
//		System.out.println(student1);
		
//		Address address = beanFactory.getBean("st2",Address.class);
//		System.out.println(address);
		
		Address address = ac.getBean("st2",Address.class);
		System.out.println(address);
		
//		AboutUs aboutus=beanFactory.getBean(AboutUs.class);
//		Home home=beanFactory.getBean(Home.class);
//		aboutus.click();
//		aboutus.click();
//		home.click();
//		home.click();
//		home.click();
//		home.click();
//	System.out.println("...................................");
//		WebsiteCounter websiteCounter=beanFactory.getBean("wc",WebsiteCounter.class);
//		WebsiteCounter websiteCounter1=beanFactory.getBean("wc",WebsiteCounter.class);
//	System.out.println("...................................");
//		WebsiteCounter websiteCounter2=beanFactory.getBean("wc1",WebsiteCounter.class);
//		WebsiteCounter websiteCounter3=beanFactory.getBean("wc1",WebsiteCounter.class);
		
		


	}

}
