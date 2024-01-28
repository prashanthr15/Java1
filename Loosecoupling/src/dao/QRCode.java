package dao;

import service.IPay;

public class QRCode implements IPay{

	public  QRCode() {
		System.out.println("QRCode is instantiated");
	}
	
	public boolean payBill(double amount) {
		System.out.println("payment is processed through QRCode and amount paid is :" +amount);
		
		return true;
	}
}
