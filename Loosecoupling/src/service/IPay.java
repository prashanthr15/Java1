package service;

public interface IPay {


	//has a relation 
	//CourseList has a debit card
	//CourseList has a credit card
	//CourseList has a QRcode
	boolean payBill(double amount);
}
