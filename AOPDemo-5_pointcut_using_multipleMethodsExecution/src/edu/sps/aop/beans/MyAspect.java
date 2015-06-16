package edu.sps.aop.beans;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
		@Pointcut("execution(public void draw())")
		public void commonPointcut(){}
	
		@Before("commonPointcut()")
		public void MyFirstAspectMethod() {
				System.out.println("cross cutting concern before the core consern.....id=001");
		}
		
		@Before("commonPointcut()")
		public void MySecondAspectMethod() {
				System.out.println("cross cutting concern before the core consern.....id=999");
		}
		
}
