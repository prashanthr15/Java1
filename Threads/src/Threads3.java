import java.util.Scanner;

class Alpha implements Runnable{
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
class Beta implements Runnable{
public void run(){
	System.out.println("printing activity started ...");
	for(int i=0;i<5;i++) {
		System.out.println("the new generated number number" +i);
	}
	System.out.println("printing activity ended ...");
	}
}
class Gamma implements Runnable{
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
public class Threads3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Alpha a = new Alpha();
		Beta b = new Beta();
		Gamma c = new Gamma();
		
//		a.Banking();
//		b.printing();
//		c.display();
		
		Thread thread1 = new Thread(a);
		Thread thread2 = new Thread(b);
		Thread thread3 = new Thread(c);
		//give it life call to thread scheduler (start();)
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}
