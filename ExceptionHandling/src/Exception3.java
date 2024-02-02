class Demo{
	public void alpha() {
		System.out.println("Alpha");
		//this leads to run time error
		//alpha();
	}
}
public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main method");
		Demo d= new Demo();
		d.alpha();
		
	}

}
