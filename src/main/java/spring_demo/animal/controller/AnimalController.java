package spring_demo.animal.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_demo.animal.dto.Cow;

public class AnimalController {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Cow c=context.getBean("cow", Cow.class);
		c.sound();
	}
	

}
