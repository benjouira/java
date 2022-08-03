package abstraction.Employee;

public abstract class Employee {
	private String name;
	private int paymentPerHoure;
	
	public Employee(String name, int paymentPerHoure) {
		super();
		this.name=name;
		this.paymentPerHoure=paymentPerHoure;
	}
	
	// Abstract methods do not specify a body
	public abstract int calculateSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaymentPerHoure() {
		return paymentPerHoure;
	}

	public void setPaymentPerHoure(int paymentPerHoure) {
		this.paymentPerHoure = paymentPerHoure;
	}
	
	
}
