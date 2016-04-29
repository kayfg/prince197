


public class Circle extends Shape{
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius > 0)
			this.radius = radius;
	}
	
	@Override
	public double calculateArea(){
		return 3.14+(radius*radius);
	}
	
	@Override
	public double calculatePerimeter(){
		return 2*3.14*radius;
	}
	
	@Override 
	public void printInfo() // Circle
	{
		System.out.printf("Circle with an id of %d, radius of %.6f, area of %.6f, and perimeter of %.6f.\n", getId(), radius, calculateArea(), calculatePerimeter());
	}
}
