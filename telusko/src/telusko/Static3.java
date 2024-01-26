package telusko;
class Parent1{
	static void disp() {
		//static methods will be inherited
		System.out.println("parent1 static disp");
	}
}
class Child1 extends Parent1{
	//@override //override cannot be resolved to a type
	//This instance method cannot override the static method from Parent1
//	 void disp() {
//		
//	}
static void disp() {
	//static methods cant be over ride 
	//method hiding i will hide the super method
	System.out.println("Child1 static disp");
	}
}



public class Static3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1.disp();
		Child1 c= new Child1();
		c.disp();
	}

}
