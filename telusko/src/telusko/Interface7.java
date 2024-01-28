package telusko;

interface Beta1{
//	all methods public and abstract
//	from java 8 interface can have method implementation
//	default is not same as acccess modifier. this is differnt
	default void disp() {
		System.out.println("interface beta1 implemented  method disp an interface");
	}
//	this method disp will be inherited in all  the implemented classes
	default void beta() {
		add();
		disp();
		System.out.println("interface beta1 implemented  method beta an interface");
	}
	//static in interface
	//cnnot inherit in implemented class and called with interface name
	static void Showing() {
		
		System.out.println("implemented  method showing an interface");
	}
	private void add() {
		System.out.println("interface private mthd add");
	}
}



interface Alp{
//	Duplicate default methods named beta with the parameters () and () are inherited from the types Alp and Beta1
//	class AlphaBeta implements Beta1,Alp{
	
	default void beta() {
		System.out.println("implemented  method beta in alp an interface");
	}
}

class AlphaBeta implements Beta1{
//	@Override
//static void Showing() {
//		
//		System.out.println("implemented  method showing an interface");
//	}
	void show() {
		System.out.println("show method in alphabeta");
	}
	
//	default is not same as acccess modifier. this is differnt
//protected as high visibility than default then it should not show any error but it shows error
	//Cannot reduce the visibility of the inherited method from Beta1
	//	protected void disp()
	//its not mandatory to over ride
	@Override
	public void disp() {
		show();
		System.out.println("in class disp");
	}
}

public class Interface7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlphaBeta ab= new AlphaBeta();
		ab.disp();
		Beta1.Showing();
		ab.beta();
		
	}

}
