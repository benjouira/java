package abstraction.drawing;

 abstract class Shape {
	String color;
	
	public Shape (String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	// these are abstract methods
		abstract double area();
		
		public abstract String toString();
}
