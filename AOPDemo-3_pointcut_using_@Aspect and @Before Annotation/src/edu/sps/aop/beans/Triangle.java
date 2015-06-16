package edu.sps.aop.beans;

public class Triangle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void draw(){
		System.out.println(getName()+" is dwawn....");
	}
	

}
