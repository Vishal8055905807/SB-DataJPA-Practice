package in.ashokit.payments;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("credit")
@Primary
public class CreditCard implements IPayment {

	@Override
	public int payBy() {
		
		System.out.println("Paid by credit card..");
		return 100;
	}

}

