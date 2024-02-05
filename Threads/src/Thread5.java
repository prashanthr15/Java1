import java.util.Scanner;

class  Calc extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("calculation class started");
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=scan.nextInt();
		System.out.println("enter the second number");
		int num2=scan.nextInt();
		
		int res = num1+num2;
		System.out.println(res);
		System.out.println("task end");
		

		
		
	}
	
}
class  Message extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("imp message started");
		for (int i=0;i<5;i++) {
			System.out.println(" imp message ended" +i);

		}
		System.out.println("imp message ended");

		
	}
	
}
public class Thread5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("main thread started");
		Calc c= new Calc();
		Message m= new Message();
		
//		Thread thread1= new Thread(c);
//		Thread thread2= new Thread(m);
//		thread2.start();
//		thread1.start();
		System.out.println(c.isAlive());
		System.out.println(m.isAlive());
		c.start();
		m.start();
		System.out.println(c.isAlive());
		System.out.println(m.isAlive());
		//join means c,m threads  will complete the task. until main thread will stop execution and allow c,m to complete its task and join back then main thread will start executing from where it stop
		c.join();
		m.join();
		System.out.println("main thread end");
		/*
		 * main thread started
false
false
true
true
calculation class started
imp message started
 imp message ended0
 imp message ended1
 imp message ended2
 imp message ended3
 imp message ended4
imp message ended
enter the first number
2
enter the second number
3
5
task end
main thread end

		 */
		

	}

}
