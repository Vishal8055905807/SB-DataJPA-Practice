package in.ashokit;

public class CreditCard implements IPayment {

	@Override
	public void pay(double amt) {
		System.out.println("Paid via Credit card");
	}

}
