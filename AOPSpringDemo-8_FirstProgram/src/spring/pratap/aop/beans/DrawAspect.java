package spring.pratap.aop.beans;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class DrawAspect 
{
	//@Before("execution(public void draw())")
	@Before("public void spring.pratap.aop.beans.Triangle.draw()")
	public void beforeDraw(){
		System.out.println("a draw operation is performed....");
	}
}
