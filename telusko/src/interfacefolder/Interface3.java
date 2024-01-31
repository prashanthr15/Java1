package interfacefolder;

interface Calc2{
	void mul();//public void abstract void mul();
	void div();
	
}


abstract class MyCalc3 implements Calc2{
	//public void abstract void mul(); one implemented
	//public void abstract void div();not implemented
	//so declare class as abstract
	//The type MyCalc3 must implement the inherited abstract method Calc2.div()
	public void mul() {
		int res=10*4;
		System.out.println("implemented by dev 1 multiplication"+res);
	}
	
//public void div() {
//	int res=10/4;
//	System.out.println("implemented by dev 1"+res);
//	}
	
	
}

public class Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
