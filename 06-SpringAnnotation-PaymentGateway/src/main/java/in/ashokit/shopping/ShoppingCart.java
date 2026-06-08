package in.ashokit.shopping;

import in.ashokit.payments.IPayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

@Autowired
// @Qualifier("debit")
IPayment payment;	

public void placeOrder() {
	
	if(payment.payBy() == 100) {
		System.out.println("Order placed..");
	}

	
}	
	
}

