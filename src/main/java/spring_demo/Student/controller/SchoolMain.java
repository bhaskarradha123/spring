package spring_demo.Student.controller;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring_demo.Student.dto.School;
import spring_demo.Student.dto.Student;

public class SchoolMain {

	
	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
	    Resource r=new ClassPathResource("student.xml");
		BeanFactory context=new XmlBeanFactory(r);
		School school=context.getBean("school",School.class);
		Student student=school.getStudent();
		System.out.println(school.getFees());
		System.out.println(student.getCourse());
	}
	
}
