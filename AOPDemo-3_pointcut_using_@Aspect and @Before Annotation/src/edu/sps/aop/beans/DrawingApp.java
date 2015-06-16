package edu.sps.aop.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService=(ShapeService) context.getBean("shapeService");
		shapeService.startServices();;
	}

}
