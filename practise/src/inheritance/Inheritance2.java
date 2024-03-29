package inheritance;

class SuperHuman {
	void show() {
		System.out.println("super human method");
	}
}

//multilevel inheritance is allowed
class Human1 extends SuperHuman {
//	private int age; private member will not participate in inheritance
	int age;

	void disp() {
		System.out.println("Human class method");
	}
}

class Employee1 extends Human1 {
	void showAge() {
		age = 10;
		System.out.println(age);
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee1 e1 = new Employee1();
		e1.disp();
		e1.showAge();
		e1.show();
	}

}
