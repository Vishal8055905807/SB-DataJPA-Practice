package in.ashokit;

public class DebitCard implements IPayment{
	public void pay(double amt) {
		System.out.println("Paid via Debit card");
	}
}
