package service;

import dao.*;

public class PaymentProcess { //extends debitcard rejected multiple inhritance is not possible

	private IPay pay;
	public PaymentProcess(IPay pay) {
		super();
		this.pay = pay;
	}
	//setter injection
	public void setPay(IPay pay) { //IPay pay = new DebitCard();
		this.pay = pay;
	}
	public boolean doPayment(double amount) {
		//composition approch 
//		//tightly coupled
//		DebitCard db= new DebitCard();
//		db.payBill(amount);
//		
//		CreditCard cc= new CreditCard();
//		cc.payBill(amount);
//		
//		QRCode qr= new QRCode();
//		qr.payBill(amount);
		
		boolean status=pay.payBill(amount);		
		if(status) {
			System.out.println("payment success");
		}
		else {
			System.out.println("payment fail");

		}
		return true;
		
	}
	//it worked interface with class object
//	IPay ay = new DebitCard();
	
}
