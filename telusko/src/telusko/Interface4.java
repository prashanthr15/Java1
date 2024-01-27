package telusko;
interface Calculator1{
	void add(int num1, int num2);
	void sub(int num1, int num2);
	void disp();
}

interface Calculator2{
	void mul(int num1, int num2);
	void div(int num1, int num2);
	void disp();
}

interface Many {
	float pi=3.14f;//public static final float pi= 3.14f
}

class Calculator3 implements Calculator1, Calculator2, Many {
//class can implements multiple interface
	
	public void add(int num1, int num2) {
		
		int res = num1+num2;
		System.out.println("add" + res);
		System.out.println(pi);
	}

	
	public void sub(int num1, int num2) {
		int res = num1-num2;
		System.out.println("sub" + res);
		
	}

	
	public void mul(int num1, int num2) {
		int res = num1*num2;
		System.out.println("mul" + res);
		
	}

	
	public void div(int num1, int num2) {
		int res = num1/num2;
		System.out.println("div" + res);
		
	}


	
	public void disp() {
		System.out.println("common implementation for disp method");
		
	}
	
	
}

public class Interface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator3 c= new Calculator3();
		c.add(3, 4);
		c.div(23, 10);
		c.sub(6, 5);
		c.mul(4, 7);
		c.disp();
		
	}

}
