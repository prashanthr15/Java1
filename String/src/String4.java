
public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Java";
		String s2=s1.concat("telusko");
		String s3= s1+s2;
		String s4 = null;
//		String s5 = s1.concat(s4);
//		System.out.println(s5);//null pointer exception ,using concat method null cannot be added
		

//		+ operator will work with null :o\p Javanull
		String s6=s1+s4;
		System.out.println(s6);
		
		//String s7= s1.concat(144);
		//The method concat(String) in the type String is not applicable for the arguments (int)
		
		String s8= s1+"prash"+99+100;
		System.out.println(s8);//after string any integer value can be taken aas string o\p Javaprash99100
		
		//String s9= 100+99;//cannot directly start with integer
		//Type mismatch: cannot convert from int to String
		
		String s10= 100+99+ "java";//o/p 
		System.out.println(s10);//199java
		
	}

}
