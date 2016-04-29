
public class ShapeTest {
//Kommentar
	public ShapeTest () {
		
	}
	
	public void start () {
	
		Shape[] shape = new Shape[3];
		int i=0;
		shape[0] = new Rectangle(10, 6.23);
		shape[1] = new Circle(5);
		shape[2] = new Triangle(3, 3, 5);
		
		for (Shape x: shape){
			x.setId(i++);
			processShape(x);}
	}
	
	public void processShape (Shape shape) {
		
		 shape.printInfo();
		 
		 if (shape instanceof Rectangle) {
			 ((Rectangle)shape).drawRectangle();
		 }
	}
	
	
	
	
	public static void main (String[] args) {
		
		ShapeTest s = new ShapeTest();
		
		s.start();
		
	}
	
	
	

}
