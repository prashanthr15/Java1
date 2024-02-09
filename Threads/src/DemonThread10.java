class MSwords implements Runnable{
	/*
	 * demon thread or back ground thread or low priority thread
	 * at last it executes
	 */
	public void typing() {
		for(int i=0;i<4;i++) {
			System.out.println("typing  .....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void spellingCheck() {
		//these 2 threads spellingcheck,autosave will follow the typing thread because this 2 are demon threads or least priority threads
		//wont loop for infinity stops with the typing thread but at last loop is demon thread one time and stops
		//for(;;) =>means for loop infinity
		//for(int i=0;i<4;i++)
		for(;;){
			System.out.println("spellingCheck  .....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void autoSave() {
		//for(int i=0;i<4;i++) 
		for(;;){
			System.out.println("autoSave  .....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String tName = Thread.currentThread().getName();
		if(tName.equals("TYPE")) {
			typing();
			
		}
		else if(tName.equals("SPELLCHECK")) {
			spellingCheck();
		}
		else {
			autoSave();
		}
		
	}
}


public class DemonThread10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MSwords ms= new MSwords();
		
		Thread t1= new Thread(ms);
		Thread t2= new Thread(ms);
		
		Thread t3= new Thread(ms);
		
		
		t1.setName("TYPE");
		t2.setName("SPELLCHECK");
		t3.setName("SAVE");
		
		
		
		//when using demon thread it will not work and its recommended to use priority lessthan 5
		//apply demon to t2,t3
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		
		//thread schedular is dominating this priorities
		//otherwise give very least values like 3,2,1
		t1.setPriority(6);
		t2.setPriority(5);
		t3.setPriority(4);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
