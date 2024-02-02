package interfacefolder;
/*
 * 3types of interfaces
 * 
 * 1 normal interface => more than 1 method
 * 2 sam => single abstract method // 1.8 name change to functional interface
 * 3 marker => no methods
 * 
 */


interface Mobile {
	void call();

	void message();
}

public class InterfaceObj {

	public static void main(String args[]) {
		Mobile m = new Mobile() {//parent reference to child object;mobile m =new Mobile();=>new Mobile is object of child anonymous class . its not a object of interfaceS
			//background anonyous class implements the interface
			public	void call() {

				System.out.println("obj of interface mobile mthd call");
				}

			public	void message() {

				System.out.println("obj of interface mobile mthd message");

				}
			};
			
			m.call();
			m.message();
	}
}
