package polymorphism;

public class MainPayment {

	public static void main(String[] args) {
		// here the runtime polymorphism fundamental is not applied
		// as it is of single CashPayment form
		CashPayment c = new CashPayment();
		c.pay();
		
		
		/* now the initialisation is done using runtim polymorphism and it can have many
		forms at runtime*/
		// Single payment "p" instance can be used to pay by cash and credit card
		Payment p = new CashPayment();
		p.pay(); //pay by cash
		
		
		p= new CreditPayment();
		p.pay(); // payment by credit
		
	}

}
