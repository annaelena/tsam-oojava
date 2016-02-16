package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Display { 
	private Shape[] shapes;

	public Shape[] getShapes() {
		return shapes;
	}

	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}
	public Display(){
		
	} 
	public double totalArea(){
		double totalArea = 0;
		for(Shape s : shapes){
			totalArea += s.area();
		}
		return totalArea;
	}
	public double totalPerimeter(){
		double totalPerimeter = 0;
		for(Shape s: shapes){
			totalPerimeter += s.perimeter();
			
		}
		return totalPerimeter;
	}
	
}
