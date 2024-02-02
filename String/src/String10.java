
public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final StringBuffer s1 = new StringBuffer("Java");
//no error here
		s1.append("is best");

		System.out.println(s1);
		
//		The final local variable s1 cannot be assigned. It must be blank and not using a compound assignment
//		s1= new StringBuffer("telusko"); 
//		System.out.println(s1);

	}

}
