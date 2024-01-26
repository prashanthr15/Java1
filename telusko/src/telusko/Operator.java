package telusko;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int a=18;
		int b=20;
		int c= 44;
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a<=b);
		System.out.println(a>=c);
		System.out.println();
		System.out.println();
		
		boolean res =(a<b) && (a>b) && (a==c);
		
		boolean ress =(a<b) || (a>b) || (a==c);
		
		System.out.println(res);
		System.out.println(ress);
	}

}
