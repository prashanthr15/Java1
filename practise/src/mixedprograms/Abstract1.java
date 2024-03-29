package mixedprograms;

abstract class Flight2 {
	abstract public void takeoff();

	abstract public void fly();

	// if 1 method is abstract name clas as abstract
	// if there is no concrete methods all methods are abstract then it is
	// 100%abstrction
	//no object for abstract
//	abstract class has constructor
//	cant make variable as abstract
	Flight2(){
		
	}
	public void landing() {
		System.out.println("Flight2 ");
	}
}

class Plane4 extends Flight {
	public void takeoff() {
		System.out.println("plane3 is taaking off");
	}

	public void fly() {
		System.out.println("plane3 is flying");
	}
}

class CargoFlight2 extends Flight {
	public void takeoff() {
		System.out.println("CargoFlight1 is taaking off");
	}

	public void fly() {
		System.out.println("CargoFlight1 is flying");
	}
}

class PassengerFlight2 extends Flight {
	public void takeoff() {
		System.out.println("PassengerFlight1 is taaking off");
	}

	public void fly() {
		System.out.println("PassengerFlight1 is flying");
	}
}

class FighterFlight2 extends Flight {
	public void takeoff() {
		System.out.println("FighterFlight1 is taaking off");
	}

	public void fly() {
		System.out.println("FighterFlight1 is flying");
	}
}

class Airport1 {
	public void permit(Flight flight) {
		flight.takeoff();
		flight.fly();
	}
}

public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoFlight2 cf = new CargoFlight2();
		PassengerFlight2 pf = new PassengerFlight2();
		FighterFlight2 ff = new FighterFlight2();

		// parent reference, method overloading= polymorphism
		// creted all child class objects and parent reference
		Airport a = new Airport();
		a.permit(cf);
		a.permit(pf);
		a.permit(ff);

//		Flight flight;
//		
//		flight =cf;//Flight flight = new CargoFlight();
//		flight.takeoff();
//		flight.fly();
//		System.out.println("      ");
//		
//		
//		flight =pf;//Flight flight = new CargoFlight();
//		flight.takeoff();
//		flight.fly();
//		System.out.println("      ");
//		
//		flight =ff;//Flight flight = new CargoFlight();
//
//		flight.takeoff();
//		flight.fly();
//		System.out.println("      ");

//		Flight f= new CargoFlight1();//up casting
//		
//		f.takeoff();
//		f.fly();

	}

}
