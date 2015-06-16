package edu.sps.aop.beans;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
		
		//@Before("execution(public * d*(..))") //dXXXX(..) means 0 or 1 argument
		//@Before("execution(public * d*(..))") //dXXXX(*) means 1 or more argument
		@Before("execution(public * get*())")//1st * means any return type and 2nd * means method starts with dXXXXX()
		public void MyAspectMethod() {
				System.out.println("cross cutting concern before the core consern.....");
		}
}
