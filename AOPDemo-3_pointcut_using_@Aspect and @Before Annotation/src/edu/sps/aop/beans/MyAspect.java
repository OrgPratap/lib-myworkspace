package edu.sps.aop.beans;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
		
		@Before("execution(public void edu.sps.aop.beans.Triangle.draw())")
		public void MyAspectMethod() {
				System.out.println("cross cutting concern before the core consern.....");
		}
}
