package inheritance;

class Aeroplane {
	void takeoff() {
		System.out.println("Aeroplane class take off");
	}

	void fly() {
		
		System.out.println("Aeroplane class take off and flying");
	}
}

class Cargoplane extends Aeroplane {
	void fly() {
		System.out.println("cargoplane class take off and flying");
	}

	void landing() {
		fly();
		System.out.println("cargoplane class landing");
	}
}

class Fighterplane extends Cargoplane {

}

public class Inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aeroplane cp = new Cargoplane();// upcasting
		cp.takeoff();// inherited
		cp.fly();// overridden method
		((Cargoplane) cp).landing();// downcasting

	}

}
