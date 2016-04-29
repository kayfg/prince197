
public class ShapeTest {
//Kommentar
	public ShapeTest () {
		
	}
	
	public void start () {
	
		Shape[] shape = new Shape[3];
		
		shape[0] = new Rectangle();
		shape[1] = new Circle();
		shape[2] = new Triangle();
		
		for (x: shape) 
			x.processShape();
	}
	
	
	
	
	
	
	public static void main (String[] args) {
		
		ShapeTest s = new ShapeTest();
		
		s.start();
		
	}
	
	public void processShape (Shape shape) {
		
		 shape.printInfo();
		 
		 if (shape instanceof Rectangle) {
			 shape.drawRectanle();
		 }
	}
	

}
