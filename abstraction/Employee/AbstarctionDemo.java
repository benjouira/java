package abstraction.Employee;

public class AbstarctionDemo {
	public static void main (String[] args) {
		Contractor c = new Contractor ("c",8,3);
		Employee f = new FullTimeEmployee("f", 10);
		Employee e = new Contractor ("e",5,3);
		
		System.out.println(c.getName());
		System.out.println(c.calculateSalary());
		
		System.out.println(f.getName());
		System.out.println(f.calculateSalary());
		
		System.out.println(e.getName());
		System.out.println(e.calculateSalary());
	}
}
