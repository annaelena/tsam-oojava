package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Circle extends Shape{
	
	
	private  double Radius;

	public double getRadius() {
		return Radius;
	}

	public void setRadius(double radius) {
		Radius = radius;
	}
	
	public double area(){
		return Math.PI * Radius * Radius;
	}
	public double perimeter(){
		return 2 * Math.PI * Radius;
	}
	
	
	
	
	
	
}
