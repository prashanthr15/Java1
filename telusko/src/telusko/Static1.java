package telusko;

public class Static1 {

	
	static int a;
	static {
		a=10;
		System.out.println(a);
		System.out.println("static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method");

	}

}
