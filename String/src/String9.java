
public class String9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StringBuffer s1= new StringBuffer("Java");
//		StringBuffer s2= new StringBuffer("Java");
		
		StringBuilder s1= new StringBuilder("Java");
		StringBuilder s2= new StringBuilder("Java");
		
		System.out.println(s1==s2);//false for both StringBuilder and StringBuffer
		//default behavior of object parent cls it is no over riding the equals method
		System.out.println(s1.equals(s2));//false for both StringBuilder and StringBuffer
		
		s1.ensureCapacity(100);
		System.out.println(s1.capacity());
		
		s1.trimToSize();
		System.out.println(s1.capacity());

	}

}
