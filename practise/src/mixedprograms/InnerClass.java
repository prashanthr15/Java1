package mixedprograms;

/*
 * 1 member inner class 
 * 2 static inner class
 * 3 anonymous inner class
 */
class A{
	int num =9;
	void show() {
		B bb = new B(); 
		System.out.println("a cls");
	}
//	static	void doSomething() //		A.B.doSomething();
	//static  class B{ //A.B ab = new A.B();
	//instance class
//			A.B b= a.new B();
//			b.doSomething();
//	private class B{ we can access it in outer class A 
	 class B{
			void doSomething() {
				//num is var of cls A 
			System.out.println("class b" + num);
			//class A method
			show();
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a= new A();
		a.show();
		System.out.println(a.num);
		//if method is static
//		A.B.doSomething();
	//A.B ab = new A.B();
		//instance class
		A.B b= a.new B(); // or new A().new B()
		b.doSomething();
	}

}
