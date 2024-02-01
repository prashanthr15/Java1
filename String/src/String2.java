
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "telusko";
		String s2= "Telusko";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

		String s3= new String("Alien");
		String s4= new String("alien");
		String s5= new String("Telusko");

		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		//it compares the reference
		System.out.println(s2==s5);
		//it compares the data 
		System.out.println(s2.equals(s5));
		//it ignores the upper case and lower case
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s3.equalsIgnoreCase(s4));

		
	}

}
