class Liberary implements Runnable{
/*
 * multiple threads are struck in block state due to cyclic dependency
 */
	String res1 = new String("Java");
	String res2 = new String("DSA");

	String res3 = new String("SpringBoot");


	@Override
	public void run() {
		// TODO Auto-generated method stub
		String tName = Thread.currentThread().getName();
		if("Student1".equals(tName)) {
			
			try {
				Thread.sleep(4000);
				synchronized (res1) {
					System.out.println("student 1 has acquired resource 1 :" + res1);
					Thread.sleep(4000);
					synchronized(res2) {
						System.out.println("student 1 has acquired resource 2 :" + res2);
						Thread.sleep(4000);
						synchronized(res3) {
							System.out.println("student 1 has acquired resource 3 :" + res3);
							Thread.sleep(5000);
						
					}
				}
			}
			}
			catch(Exception e) {
				System.out.println("some problem");
			}
		}else {
			try {
				Thread.sleep(4000);
				synchronized (res1) {
					System.out.println("student 2 has acquired resource 1 :" + res1);
					Thread.sleep(4000);
					synchronized(res2) {
						System.out.println("student 2 has acquired resource 2 :" + res2);
						Thread.sleep(4000);
						synchronized(res3) {
							System.out.println("student 2 has acquired resource 3 :" + res3);
							Thread.sleep(5000);
						
					}
				}
			}
			}
			catch(Exception e) {
				System.out.println("some problem");
			}
		}
		
	}
	
}
public class Thread8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Liberary l= new Liberary();
		
		Thread t1= new Thread(l);
		Thread t2= new Thread(l);
		
		
		t1.setName("Student1");
		t2.setName("Student2");
		
		t1.start();
		t2.start();

	}

}
