package interfacefolder;


interface Calc1{
	void add();//public void abstract void add();
	void sub();
	
}


class MyCalc1 implements Calc1{
	
	public void add() {
		int res=10+4;
		System.out.println("implemented by dev 1"+res);
	}
	
public void sub() {
	int res=10-4;
	System.out.println("implemented by dev 1"+res);
	}
	
	
}


class MyCalc2 implements Calc1{
	
	public void add() {
		
		int a=10;
		int b=4;
		
		int res=a+b;
		System.out.println("implemented by dev 2"+res);
	}
	
public void sub() {
	
	int a=10;
	int b=4;
	int res=10-4;
	System.out.println("implemented by dev 2"+res);
	}
}




public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalc1 mc1 = new MyCalc1();
		mc1.add();
		mc1.sub();
		
		MyCalc2 mc2 = new MyCalc2();
		mc2.add();
		mc2.sub();
	}

}
