package mixedprograms;

class Flight1{
	public void takeoff() {
		System.out.println("Flight1 is taaking off");
	}
	
	public void fly() {
		System.out.println("Flight1 is flying");
	}
}
class Plane3 extends Flight{
	public void takeoff() {
		System.out.println("plane3 is taaking off");
	}
	
	public void fly() {
		System.out.println("plane3 is flying");
	}
}

class CargoFlight1 extends Flight{
	public void takeoff() {
		System.out.println("CargoFlight1 is taaking off");
	}
	
	public void fly() {
		System.out.println("CargoFlight1 is flying");
	}
}

class PassengerFlight1 extends Flight{
	public void takeoff() {
		System.out.println("PassengerFlight1 is taaking off");
	}
	
	public void fly() {
		System.out.println("PassengerFlight1 is flying");
	}
}

class FighterFlight1 extends Flight{
	public void takeoff() {
		System.out.println("FighterFlight1 is taaking off");
	}
	
	public void fly() {
		System.out.println("FighterFlight1 is flying");
	}
}
class Airport {
	public void permit(Flight flight) {
		flight.takeoff();
		flight.fly();
	}
}

public class Poly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoFlight1 cf = new CargoFlight1();
		PassengerFlight1 pf = new PassengerFlight1();
		FighterFlight1 ff = new FighterFlight1();
		
		//parent reference, method overloading= polymorphism
		//creted all child class objects and parent reference
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
