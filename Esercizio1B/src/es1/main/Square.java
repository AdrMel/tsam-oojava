package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Square extends Shape{

	double side;
	
	public Square() {
		side = -1;
	}
	
	public Square(double lato) {
		lato = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double area() {
		double area = 0.0;
		area = side * side;
		return area;
	}
	
	public double perimeter() {
		double perim = 0.0;
		perim = side * 4;
		return perim;
	}
	
}
