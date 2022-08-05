package polymorphism;

class CreditPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("this is a credit payment");
	}

}
