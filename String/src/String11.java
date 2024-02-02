
public class String11 {

	public static void main(String[] args) {

		//telusko =>oksulek
		
		String s1= "telusko";
		String s2="";
		
		for (int i=s1.length()-1;i>=0;i--) {
			
			s2=s2+s1.charAt(i);
		}
		
		System.out.println("the reversed string is " +s2);
	}

}
