package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Display {
	
	private Shape[] shapes;
	
	public Display() {
		shapes = null;
	}
	
	public Display(Shape[] sh) {
		shapes = sh;
	}

	
	public Shape[] getShapes() {
		return shapes;
	}

	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}

	public double totalArea() {
		double tot = 0.0;
			for(int i = 0; i < shapes.length; i++) {
				tot += shapes[i].area();
			}
		return tot;
	}
	
	public double totalPerimeter() {
		double tot = 0.0;
			for(int i = 0; i < shapes.length; i++) {
				tot += shapes[i].perimeter();
			}
		return tot;
	}
	
	
	
}
