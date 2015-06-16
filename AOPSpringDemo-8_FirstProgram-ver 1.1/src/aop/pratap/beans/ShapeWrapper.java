package aop.pratap.beans;

import aop.pratap.beans.samples.Circle;
import aop.pratap.beans.samples.Triangle;

public class ShapeWrapper 
{
	private Circle circle;
	private Triangle triangle;
	public Circle getCircle() {
		return circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
}
