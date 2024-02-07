/*
 * how to control the flow of threads
 * using synchronized
 * synchronized apply to methhod and block
 */
class CarsShare implements Runnable{

	@Override
	 public void run() {
		// TODO Auto-generated method stub
		try {
		System.out.println(Thread.currentThread().getName() + "has entered the parking lot");
		Thread.sleep(3000);
		synchronized(this){
		System.out.println(Thread.currentThread().getName()+ "has got into car");
		Thread.sleep(3000);
		
		System.out.println(Thread.currentThread().getName()+ "started to drive car");
		Thread.sleep(3000);
		
		System.out.println(Thread.currentThread().getName()+ "came back from the drive and park the car");
		Thread.sleep(3000);
		
		System.out.println(Thread.currentThread().getName()+ "came pout of parking lot car");

		}

		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
public class Thread7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarsShare cs = new CarsShare();
		
		Thread t1= new Thread(cs);
		Thread t2= new Thread(cs);
		Thread t3= new Thread(cs);
		
		
		t1.setName("child1");
		t2.setName("child2");
		t3.setName("child3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
