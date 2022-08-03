package abstraction.Employee;

public class Contractor extends Employee{
	
	private int workingHours;
	public Contractor(String name ,int paymentPerHoure, int workingHours) {
		super(name ,paymentPerHoure);
		this.workingHours = workingHours;
	}
	
	@Override
	public int calculateSalary() {
		return (getPaymentPerHoure() * workingHours);
	}

}
