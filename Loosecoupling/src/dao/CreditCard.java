package dao;

import service.IPay;

public class CreditCard implements IPay{

	public  CreditCard() {
		System.out.println("CreditCard is instantiated");
	}
	
	public boolean payBill(double amount) {
		System.out.println("payment is processed through CreditCard and amount paid is :" +amount);
		
		return true;
	}
}
