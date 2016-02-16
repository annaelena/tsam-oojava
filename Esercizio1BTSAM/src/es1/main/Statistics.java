package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Statistics {
	
	protected double area;
	protected double perimeter;
	
	public Statistics (double perimeter, double area){
		this.perimeter = perimeter;
		this.area= area;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public void add(Statistics st){
		this.area += st.area;
		this.perimeter += st.perimeter;
		
		
	}
	
}
