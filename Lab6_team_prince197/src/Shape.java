
public abstract class Shape {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();
	
	public abstract void printInfo();
	
}
