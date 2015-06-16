package aop.ptatap.application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.pratap.beans.ShapeWrapper;
public class DrawingApp {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//ShapeWrapper shape=(ShapeWrapper) context.getBean("shape");
		ShapeWrapper shape=context.getBean("shape", ShapeWrapper.class);
		System.out.println(shape.getCircle().getBeanName());
		System.out.println(shape.getTriangle().getBeanName());
		
	}

}
