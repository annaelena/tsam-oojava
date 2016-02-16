package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Square extends Shape {
	
	private double Side;

	public double getSide() {
		return Side;
	}

	public void setSide(double side) {
		Side = side;
	}
	public double area(){
		return Side * Side;
	}
	
	public double perimeter(){
		return 4 * Side;
	}
	

}
