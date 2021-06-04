package ch10;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
	}

}
