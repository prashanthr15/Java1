package mixedprograms;
class Flight{
	public void takeoff() {
		System.out.println("Flight is taaking off");
	}
	
	public void fly() {
		System.out.println("Flight is flying");
	}
}
class Plane2 extends Flight{
	public void takeoff() {
		System.out.println("plane is taaking off");
	}
	
	public void fly() {
		System.out.println("plane is flying");
	}
}

class CargoFlight extends Flight{
	public void takeoff() {
		System.out.println("CargoFlight is taaking off");
	}
	
	public void fly() {
		System.out.println("CargoFlight is flying");
	}
}

class PassengerFlight extends Flight{
	public void takeoff() {
		System.out.println("PassengerFlight is taaking off");
	}
	
	public void fly() {
		System.out.println("PassengerFlight is flying");
	}
}

class FighterFlight extends Flight{
	public void takeoff() {
		System.out.println("FighterFlight is taaking off");
	}
	
	public void fly() {
		System.out.println("FighterFlight is flying");
	}
}





public class Poly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoFlight cf = new CargoFlight();
		PassengerFlight pf = new PassengerFlight();
		FighterFlight ff = new FighterFlight();
		
		Flight flight;
		
		flight =cf;//Flight flight = new CargoFlight();
		flight.takeoff();
		flight.fly();
		System.out.println("      ");
		
		
		flight =pf;//Flight flight = new CargoFlight();
		flight.takeoff();
		flight.fly();
		System.out.println("      ");
		
		flight =ff;//Flight flight = new CargoFlight();

		flight.takeoff();
		flight.fly();
		System.out.println("      ");


	}

}
