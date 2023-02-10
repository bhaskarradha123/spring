package spring_demo.Student.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_demo.Student.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
		Student s=context.getBean("std",Student.class);
		System.out.println(s.getName());
		System.out.println(s.getCourse());
		System.out.println(s.getPhone());
		
		

	}

}
