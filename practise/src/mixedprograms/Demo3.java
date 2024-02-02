package mixedprograms;

class Demo4 {

	static {
		System.out.println("static block in demo4");
	}

	static void disp() {
		System.out.println("static method in demo4");
	}
}

public class Demo3 {
	static {
		System.out.println("static block in demo3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4.disp();

//		there is call to demo4 method so demo4 have to load into JVM then it loads the static block in demo4

	}

}
