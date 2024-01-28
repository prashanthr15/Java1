package main;

import java.util.Scanner;

import dao.CreditCard;
import dao.DebitCard;
import dao.QRCode;
import service.PaymentProcess;

public class App {

	public static void main(String[] args) {
		
//		PaymentProcess pp= new PaymentProcess();
		System.out.println("welcome to fuel station choose the option");
		Scanner scan = new Scanner (System.in);
		System.out.println("choose the option :");
		System.out.println("Credit card enter 01: Debit card enter 02 : QR code 03");
		int option = scan.nextInt();
		if(option ==2) {
//			pp.setPay(new DebitCard());
			PaymentProcess pp= new PaymentProcess(new DebitCard());

			pp.doPayment(100.5);
		}
		else if(option ==1) {
			//dependency injection throughsetter injection 
			//dependency injection
//			pp.setPay(new CreditCard());
			//constructer injectn 
			PaymentProcess pp= new PaymentProcess(new CreditCard());

			pp.doPayment(100.5);
		}
		else if(option ==3) {
//			pp.setPay(new QRCode());
			PaymentProcess pp= new PaymentProcess(new QRCode());

			pp.doPayment(100.5);
		}
		else {
			System.out.println("select valid option");
		}
		
		
//		pp.setPay(new DebitCard());
//		pp.doPayment(100.5);

	}

}
