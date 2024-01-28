package telusko;

abstract class Abc{
	public void show1() {
		System.out.println("in abstract class abc show1 mthd");
	}
public 	abstract void show2();
}
public class AbstrctObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//parent reference to child object;Abc abc = new Abc();=>new Abc is object of child anonymous class . its not a object of abstract class
		//background anonyous class implements the abstract

		Abc abc = new Abc()
				{
			
			public void show1() {
//				calling the superclass method show1()
				super.show1();
				System.out.println("in anonymous class  show1 mthd");
			}
			public void show2() {
				System.out.println("in anonymous class  show2 mthd");
			}
			
				};
				
				abc.show1();
				abc.show2();
				
	}

}
