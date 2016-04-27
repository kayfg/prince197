
public class Rectangle extends Shape{

	private double width;
	private double height;
	
	public Rectangle (double x, double y) {
		
	}
	
	public double calculateArea() {
		double area = width * height;
		return area;
	}
	
	public double calculatePerimeter() {
		double perimeter = 2 * (width + height);
		return perimeter;
	}
	
	public void drawRectangle () {
		
		
		
	}
	
	@Override 
	public void printInfo() // Rectangle
	{
		System.out.printf("Rectangle with an id of %d, width of %.6f, height of %.6f, area of %.6f, and perimeter of %.6f.", getId(), width, height, calculateArea(), calculatePerimeter());

	}

	
}
