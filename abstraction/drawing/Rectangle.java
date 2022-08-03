package abstraction.drawing;

public class Rectangle extends Shape {
	double length;
	double width;

	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle color is : "+super.color+" and area is : "+ this.area();
	}
	
}
