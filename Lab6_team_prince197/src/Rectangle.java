
public class Rectangle extends Shape{

	private double width;
	private double height;
	
	public Rectangle (double x, double y) {
		width=y;
		height=x;
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
		
		for(int i=0;i<(int)width;i++){ 		//int cast to draw a line only by at full number (**)
											//ex. 5.99 => 5 lines, 6.12 => 6 lines
			if(i==0||i==((int)width)-1)		//cast to draw the first sign right!
				System.out.print("+");		
			else
				System.out.print("|");
			
			for(int j=0;j<(int)height;j++){ //(**)
				System.out.print("-");		
			}
			
			if(i==0||i==((int)width)-1)		//cast to draw the last sign right!
				System.out.print("+");
			else
				System.out.print("|");
			System.out.println();
		}
	}
	
	@Override 
	public void printInfo() // Rectangle
	{
		System.out.printf("Rectangle with an id of %d, width of %.6f, height of %.6f, area of %.6f, and perimeter of %.6f.\n", getId(), width, height, calculateArea(), calculatePerimeter());

	}

	
}
