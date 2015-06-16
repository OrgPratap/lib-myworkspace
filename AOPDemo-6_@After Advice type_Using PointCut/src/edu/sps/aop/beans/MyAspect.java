package edu.sps.aop.beans;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
		@Pointcut("execution(public void draw())")
		public void commonPointcut(){}
	
		@Before("commonPointcut()")
		public void myFirstBeforeAdviceMethod() {
				System.out.println("first before advice....");
		}
		
		@Before("commonPointcut()")
		public void mySecondBeforeAdviceMethod() {
				System.out.println("second before advice....");
		}
		//@AfterReturning gets executed only if the method executes successfully and doesn't raise any exception
		@After("commonPointcut()")
		public void myFirsteAfterAdviceMethod(){
			System.out.println("first after advice......");
		}
		
		@After("commonPointcut()")
		public void mySecondAfterAdviceMethod(){
			System.out.println("second after advice.....");
		}
		
		@After("execution(public void startServices())")
		public void afterCoreConcern(){
			System.out.println("after core concern.....");
		}
		
}
