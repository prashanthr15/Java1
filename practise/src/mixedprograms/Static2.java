package mixedprograms;
class TestConstructer{
//	test if super constructer called before static block "no"
	//out put
//	static initialaization block
//	TestConstructer superConstructer called 
//	instance initialaization block
//	constructor
//	instance method
//	100
//	200
//	static method
//	10
//	20
//	static method
//	10
//	20
	TestConstructer(){
		System.out.println("TestConstructer superConstructer called ");
	}
}
class Demo2 extends TestConstructer{
	
	
	static int a,b;
	int x,y;
	
	
	static {
		a=10;
		b=20;
		System.out.println("static initialaization block");
	}
	
//	java initialaization block
	
	{
		x=100;
		y=200;
		System.out.println("instance initialaization block");
	}
	
	Demo2(){
		System.out.println("constructor");
	}
	
	
	static void disp1() {
		System.out.println("static method");
		System.out.println(a);
		System.out.println(b);
	}
	
	void disp2() {
		System.out.println("instance method");
		System.out.println(x);
		System.out.println(y);
	}
	
}




public class Static2 {

	public static void main(String[] args) {
		Demo2 d2= new Demo2();
		d2.disp2();
		Demo2.disp1();
		d2.disp1();
		

	}

}
