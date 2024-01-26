package telusko;

import java.util.Scanner;

class Farmer{
	
	float payment;
	float td;
	float si;
	static float ri;
	
	static {
		ri=3.15f;
	}
	
	void input() {
		System.out.println("welcome to loan app");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("farmer kindly tell us hoe much amount needed");
		payment=scan.nextFloat();
		System.out.println("farmer kindly tell us how much time needed to [pay back?");
		td = scan.nextFloat();
		
		
	}
	
	
	void compute() {
		si=payment*td*ri/100.0f;
	}
	
	void disp() {
		System.out.println("this is si:  " + si);
	}
}





public class FarmerLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Farmer f1= new Farmer();
		Farmer f2= new Farmer();
		Farmer f3= new Farmer();
		
		
		f1.input();
		f1.compute();
		f1.disp();
		
		
		f2.input();
		f2.compute();
		f2.disp();
		
		
		f3.input();
		f3.compute();
		f3.disp();
		
		
;	}

}
