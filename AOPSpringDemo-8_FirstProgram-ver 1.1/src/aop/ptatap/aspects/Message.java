package aop.ptatap.aspects;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Message 
{
	//@Before("execution(public String getBeanName())")	//for every specific method call
	@Before("execution(public String aop.pratap.beans.sample.Circle.getBeanName())")	//for only circle specific method call
	public void message()
	{
		System.out.println("a getMethod() is called....");
	}
}
