package telusko;
//parent or super or base class
class Human{
	
	void sleep() {
		System.out.println("human needs sleep");
	}
}
//child or sub or derived class
class Student1 extends Human{
//	is-a relation ship is recommended
//	student is a human
//	pen is a animal .so, this is not recommended
}
class Animal{
	void eat() {
		
		System.out.println("animal eat");
	}
	
}

class Pen extends Animal{
	
}

public class Inheritance1 {

	public static void main(String[] args) {
		

		Student1 s1= new Student1();
		s1.sleep();
		Pen p= new Pen();
		p.eat();
	}

}
