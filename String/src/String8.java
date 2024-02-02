
public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//StringBuffer s1= "java";//invalid
		
		//StringBuffer s2 = new StringBuffer("Java");
//		tostring method is overridden in StringBuffer
//		System.out.println(s2);
//		System.out.println(s2.capacity());//
		
		StringBuffer s2 = new StringBuffer();
		System.out.println(s2);
		System.out.println(s2.capacity());//16 
		System.out.println("***************************************");
//		StringBuilder s3 = new StringBuilder("Java");
//		System.out.println(s3);
		
		StringBuilder s3 = new StringBuilder();
		System.out.println(s3);
		System.out.println(s3.capacity());//16 
		s3.append("Java");
		s3.append(" is the best");
		System.out.println(s3);
		System.out.println(s3.capacity());//16 
		s3.append(" and");
		System.out.println(s3);
		System.out.println(s3.capacity());//34 ==>(16)old capacity *2 +2=>34
		
		
		
		
		
	}

}
