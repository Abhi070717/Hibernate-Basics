package com.rays.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestPerson {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("person.xml"));
		
		Person person = factory.getBean("person", Person.class);
		
		System.out.println("Name: " + person.getName());
		System.out.println("Address: " + person.getAddress());
		
	}

}
