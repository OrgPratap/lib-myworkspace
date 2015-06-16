package edu.sps.aop.beans;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	public void startServices(){
		System.out.println("______SERVICE______");
		System.out.println("------begin------");
		getCircle().draw();
		getTriangle().draw();
		System.out.println("------end--------");
	}

}
