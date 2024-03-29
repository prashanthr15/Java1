package inheritance;

class Planel {

}

class FighterPlane1 extends Planel {

}

class Human2 {
	public void sleep(int a, int b) {
		System.out.println("human2 is sleeping parameter ");
	}

	public void sleep() // overriding
	{
		System.out.println("human is sleeping");
	}

	public Planel eat() {
		System.out.println("human cp-varien type Planel needs to eat");
		Planel p1 = new Planel();
		return p1;
	}
}

class Employee2 extends Human2 {
//	protected void sleep() //overridden
//	{
//		Cannot reduce the visibility of the inherited method from Human2
//		System.out.println("employee is sleeping");
//	}
	public void sleep(int a, int b ,int c) {
//The method sleep(int, int) in the type Human2 is not applicable for the arguments (int, int, int)
		//Human2 e = new Employee2(); because of this we got error . in super class only teo parametres are there.in child extra parameter is present so it is a specilaised skill in skill
		System.out.println("Employee2 is sleeping parameters one"+ a + b + c);
	}

	public void sleep() {
		System.out.println("employee is sleeping");
	}

//		overriding using co-varient type means class type we can change the return type but not with primitives types
	public FighterPlane1 eat() {
		System.out.println("Employee2  FighterPlane1 needs to eat cp-varient type");
		FighterPlane1 fp = new FighterPlane1();
		return fp;
	}
//		public void eat() {
//			System.out.println("human needs to eat");
//			return 100;
//		}//The return type is incompatible with Human2.eat() return type of overriden method cannot be changed
}

public class Inheritance5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Human2 e = new Employee2();
		Employee2 e = new Employee2();
		e.sleep();
		e.eat();
		e.sleep(2,4,5);

	}

}
