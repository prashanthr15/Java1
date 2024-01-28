package telusko;


class IPhone14{
	public void show() {
		System.out.println("same as iphone 14 class extra price");
	}
	
	public void abc() {
		System.out.println("same as iphone 14 abc mthd class extra price");
	}
	
	
	
}


class IPhone15 extends IPhone14{
	public void show() {
		System.out.println("same as iphone15 class extra price");
	}
}
public class Apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		IPhone14 p= new IPhone15();
		IPhone14 p1= new IPhone14()
		//annonymous inner class
				//used only once we cannot reuse it
				{
//			we can add multiple methods
			public void show() {
				System.out.println("anonymous class  class extra price");
			}
			public void abc() {
				System.out.println("same as anonymous  abc mthd class extra price");
			}
			
			public void aabc() {
				System.out.println("same as anonymous  aabc mthd class extra price");
			}
				};
		p1.show();

//		IPhone14 p2= new IPhone14();
		p1.show();
		p1.abc();
	//	p1.aabc(); it was not there in Iphone 14 class because the reference p1 is Iphone14
		
		
	}

}
