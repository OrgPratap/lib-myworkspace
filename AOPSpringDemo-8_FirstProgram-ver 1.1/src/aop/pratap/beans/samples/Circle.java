package aop.pratap.beans.samples;

import org.springframework.beans.factory.BeanNameAware;

public class Circle //implements BeanNameAware
{
	private String beanName;

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
}
