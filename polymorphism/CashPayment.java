package polymorphism;

class CashPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("this is a cash payment");
	}

}
