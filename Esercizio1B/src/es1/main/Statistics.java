package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Statistics {
	
	double perimeter;
	double area;
	
	public Statistics() {
		perimeter = 0.0;
		area = 0.0;
	}
	
	public Statistics(double perimeter, double area) {
		this.perimeter = perimeter;
		this.area = area;
	}
	
	public void add(Statistics s) {
		
		this.area += s.getArea();
		this.perimeter += s.getPerimeter();
		
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	}

