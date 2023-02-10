package spring_demo.Employee.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_demo.Employee.dto.Employee;

public class EmployeeController {
 
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		Employee e=context.getBean("emp",Employee.class);
		e.print();
	}
}
