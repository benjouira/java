package polymorphism.overloading;

public class MainAdder {

	public static void main(String[] args) {
		System.out.println(Adder_ChangeArgs.add(11, 11));
		System.out.println(Adder_ChangeArgs.add(11, 11, 11));

		System.out.println(Adder_ChangeTypes.add(11.11, 11.11));
		
	}

}
