package sample;

public class Test2 {

	
	int h=2;
	int j=3;
	static double k = 4;
	static double l= 5;
	
	void add(){
		
		int q = h+j;
		int s= h-j;
		System.out.println(q +" "+ s);
		
	}
	
	static void added(){
		double e = k+l;
		double f= k-l;
		System.out.println(e +" "+ f);
		Test2 t2= new Test2();
		t2.add();
	}
	
	public static void main(String args[]) {
		
//		Test2 t2= new Test2();
//		t2.add();
		added();
	}
}
