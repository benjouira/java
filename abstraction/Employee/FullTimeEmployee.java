package abstraction.Employee;

public class FullTimeEmployee extends Employee{

	public FullTimeEmployee(String name, int paymentPerHoure) {
		super(name, paymentPerHoure);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return (getPaymentPerHoure()*8);
	}
	
}
