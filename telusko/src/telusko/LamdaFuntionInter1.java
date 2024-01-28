package telusko;

interface Siri1{
	int sq(int i);
}

public class LamdaFuntionInter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Siri1 s = new Siri1() {
//			public int sq(int i) {
//				return i*i;
//			}};
//			Siri1 s1= (int i )-> i*i;
//		Siri1 s1= ( i )-> i*i;
		Siri1 s1=  i -> i*i;
			System.out.println(s1.sq(5));
		}
		
	}


