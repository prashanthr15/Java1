class Producer extends Thread{
	
	Queue q;
	
	public Producer(Queue q) {
		this.q=q;
	}
	@Override
	public void run() {
		
		int i=1;
		//infinity loop
		while(true) {
			q.put(i++);
		}
	}
}

class Consumer extends Thread{
	
	Queue q;
	
	Consumer(Queue q){
		this.q=q;
	}
	@Override
	public void run() {
		

		//infinity loop
		while(true) {
			q.get();
		}
	}
}

class Queue {
	int i;
	boolean  flag=false;
	synchronized public void put(int x) {
		try
		{
			if(flag==true) {
				wait();
			}
			else {
			i=x;
			System.out.println("i have produced the data into x :" +x);
			flag=true;
			notify();
			}
		}
		catch(Exception e) {
			System.out.println("some problem" +e.getStackTrace());
		}
		
	}
	/*
	 * there is no synchronized i got this error 
	 * so placed the synchronized for methods
	 * java.lang.IllegalMonitorStateException: current thread is not owner
	at java.base/java.lang.Object.wait(Native Method)
	at java.base/java.lang.Object.wait(Object.java:338)
	at Queue.get(ThreadProducer9.java:61)
	at Consumer.run(ThreadProducer9.java:31)
some problem
	 */
	synchronized public void get() {
		try {
			if(flag==false) {
				wait();
			}
			else {
		System.out.println("i have consumed the data into x :" +i);
		flag=false;
		notify();
			}
		}
		catch(Exception e) {
			System.out.println("some problem"  );
			e.printStackTrace();
		}
	}
}
/*intra means same class
 * inter means diff classes
 * 
 * sleep() ,join()we can use for intra thread 
 * wait(0 we can use in inter thread
 * no communication bw the threads 
 * and keep on infinity loops
 * this wait and notify will communic ate like 
 * one metod wait with another methd notify
 * one metod notify  with another methd wait
 * to communicate use wait(),notify() methods 
 * for every wait() mthd ,to come out from wait state it should encounter with notify() mthd
 */
public class ThreadProducer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q= new Queue();
		Producer p= new Producer(q);
		Consumer c = new Consumer(q);
		
		p.start();
		c.start();

	}

}
