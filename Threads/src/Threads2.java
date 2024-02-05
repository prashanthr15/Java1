
public class Threads2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("main thread started");
//to get the current thread name
		Thread th = Thread.currentThread();
		String thName = th.getName();

		System.out.println(thName);
		//gives thread name
		System.out.println("currently the thread which is running is: " + thName);
		//gives thread priority
		System.out.println("priority of the thread is : " + th.getPriority());
		//changing the name of thread
		th.setName("prashnath");
		//setting the priority of the thread
		th.setPriority(6);
		//gives thread name
				System.out.println("currently the thread which is running is: " + th.getName());
				//gives thread priority
				System.out.println("priority of the thread is : " + th.getPriority());
//		System.out.println("currently the thread which is running is: " + Thread.currentThread());
//Thread.sleep(5000);

		System.out.println("main thread completed the task");
	}

}
