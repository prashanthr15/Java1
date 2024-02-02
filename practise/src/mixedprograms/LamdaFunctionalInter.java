package mixedprograms;


interface Siri {
	void show();
}
//lamda or functional interface or SAM sinfle abstract methods
//it has only one methods it didnt work with two methods
public class LamdaFunctionalInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Siri s= new Siri() {
//		public void show(){
//				System.out.println("methodi annonymous");
//			}
//		};
		//using lamda function
		
		Siri s = () -> System.out.println("methodi annonymous");
		s.show();
	}

}
