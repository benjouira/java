package abstraction.drawing;

public class AbstractionTest {
	public static void main (String[] args) {
		Shape c = new Circle("red", 3);
		Shape r = new Rectangle("green", 5, 3);
		
		System.out.println(c);
		System.out.println(r.toString());
	}
}
