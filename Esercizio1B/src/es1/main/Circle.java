package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Circle extends Shape{
	double radius;
	
	public Circle() {
		radius = -1.0;
	}
	
	public Circle(double raggio) {
		raggio = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		double area = 0.0;
		area = Math.PI * (radius * radius);
		return area;
	}
	
	public double perimeter() {
		double perim = 0.0;
		perim = (2 * Math.PI) * radius;
		return perim;
	}
}
