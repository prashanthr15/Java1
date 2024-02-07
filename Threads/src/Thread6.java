import java.util.Scanner;

class Alien implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String tName=Thread.currentThread().getName();
		System.out.println(Thread.currentThread().getPriority());
		if(tName.equals("CALC")) {
			calc();
		}else {
			message();
		}
	}
	
	public void calc() {
		System.out.println("calculation task started");
		Scanner scan= new Scanner(System.in);
		System.out.println("enteer 1 number");
		int num1=scan.nextInt();
		System.out.println("enteer 2 number");
		int num2=scan.nextInt();
		int res=num1+num2;
		System.out.println(res);
		System.out.println("calculation task started");
		
	}
	
	public void message() {
		System.out.println("enteer message number");
		for(int i=0;i<5;i++) {
			System.out.println("message" +i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
public class Thread6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien al = new Alien();
		
		Thread t1= new Thread(al);
		Thread t2= new Thread(al);
		
		t1.setName("CALC");
		t2.setName("MSG");
		
		t1.start();
		t2.start();
		
		

	}

}
