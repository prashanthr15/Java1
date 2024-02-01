
public class String1 {

	public static void main(String args[]) {
		String s = "java";
		System.out.println(s);

		s = s.concat("spring");

		System.out.println(s);
		// this is stored in inside heap and also one copy will be stored in string
		// cosntant pool whic is accesed by jvm
		//duplicates are  allowed in heap memory

		String s1 = new String("java");
		String s2 = new String("java");
		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));//true it checks only data not reference

		// this is stored in string constant pool inside heap
		//duplicates are not allowed in string constant pool
		String s3 = "java";
		String s4 = "java";

		System.out.println(s4 == s3);// true

	}
}
