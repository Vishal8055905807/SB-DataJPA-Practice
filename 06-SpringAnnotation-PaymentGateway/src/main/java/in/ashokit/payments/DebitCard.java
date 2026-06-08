package in.ashokit.payments;

import org.springframework.stereotype.Component;

@Component("debit")
public class DebitCard implements IPayment {
	
	@Override
	public int payBy() {
	
		System.out.println("Paid by debit card..");
		return 100;
	}
}

