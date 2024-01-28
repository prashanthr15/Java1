package dao;

import service.IPay;

public class DebitCard  implements IPay{

	public  DebitCard() {
		System.out.println("DebitCard is instantiated");
	}
	
	public boolean payBill(double amount) {
		System.out.println("payment is processed through debitcard and amount paid is :" +amount);
		
		return true;
	}
	//it worked interface with class object
//	IPay ay = new DebitCard();
}
