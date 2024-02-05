import java.util.Scanner;

class Alpha1 extends Thread{
	public void run(){
System.out.println("banking activity started ...");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter account number");
		int accNo= scan.nextInt();
		System.out.println("enter account number");
		int password = scan.nextInt();
		
		System.out.println("login succesful");
		System.out.println("banking activity ended ...");
	}
}
class Beta1 extends Thread{
public void run(){
	System.out.println("printing activity started ...");
	for(int i=0;i<5;i++) {
		System.out.println("the new generated number number" +i);
	}
	System.out.println("printing activity ended ...");
	}
}
class Gamma1 extends Thread{
public void run() {
	System.out.println("displaying activity started ...");
	for(int i=0;i<5;i++) {
		System.out.println("1 the new generated number number" +i);
		 
	}
	for(int i=0;i<5;i++) {
		System.out.println("2 the new generated number number" +i);
		
	}
	for(int i=0;i<5;i++) {
		System.out.println("3 the new generated number number" +i);
	}
	for(int i=0;i<5;i++) {
		System.out.println("4 the new generated number number" +i);
	}
	System.out.println("displaying activity ended ...");
	}
}
public class Threads4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Alpha1 a = new Alpha1();
		Beta1 b = new Beta1();
		Gamma1 c = new Gamma1();

		a.start();
		b.start();
		c.start();
		

	}

}
