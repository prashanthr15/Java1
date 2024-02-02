
public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="RajaRamMohanRoy";
		System.out.println(s1.toUpperCase());//RAJARAMMOHANROY
		System.out.println(s1.toLowerCase());//rajarammohanroy

		
		System.out.println(s1.substring(4));//RamMohanRoy
		System.out.println(s1.substring(4,5));//R
		System.out.println(s1.substring(4,7));//Ram
		System.out.println(s1.charAt(4));//R
		System.out.println(s1.endsWith("Roy"));//true
		System.out.println(s1.endsWith("y"));//true
		System.out.println(s1.endsWith("a"));//false
		
		
		System.out.println(s1.startsWith("Ra"));//true
		System.out.println(s1.indexOf("a"));//1
		System.out.println(s1.lastIndexOf("a"));//10
		System.out.println(s1.length());//15
		
		
		String ar[]= s1.split("a");
		for (String ele:ar) {
			System.out.print(ele);//RjRmMohnRoy
		}
		System.out.println();
		
		char carr[]= s1.toCharArray();
		for(char car:carr) {
			System.out.print(car);//RajaRamMohanRoy
		}



		



	}

}
