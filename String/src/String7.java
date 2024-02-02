
public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new  String("Java");
		
		//s1 is stored in heap memory because of new keyword.and a copy is stored in string constant pool as well
		//this intern() method will point to the string constant pool
		String s2=s1.intern();
		String s3= "Java";
		
		System.out.println(s2==s3);
	}

}
