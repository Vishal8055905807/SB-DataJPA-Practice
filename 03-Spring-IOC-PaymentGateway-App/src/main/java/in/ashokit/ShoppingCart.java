package in.ashokit;

public class ShoppingCart {
	
IPayment payment;	

public ShoppingCart(IPayment payment) {
	this.payment = payment;
}

public void placeOrder() {
	payment.pay(2.26);
}
	
}
