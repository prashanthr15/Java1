package mixedprograms;

public class MethodOL {

	int  add(int n1, int n2, int n3) {
		return n1+n2;
	}
	
	
	int  add(int n1, int n2) {
		return n1+n2;
	}
	
	float  add(float n1, float n2, float n3) {
		return n1+n2;
	}
	
	
	float  add(float n1, float n2) {
		return n1+n2;
	}
	
	double  add(double n1, double n2, double n3) {
		return n1+n2;
	}
	
	
	double  add(double n1, double n2) {
		return n1+n2;
	}
	
	double  add(int n1, float n2, double n3) {
		return n1+n2;
	}
	
	
	double  add(float n1, double n2) {
		return n1+n2;
	}
	

	double  add(double n1, int n2) {
		return n1+n2;
	}
	
	
	double  add(int n1, double n2) {
		return n1+n2;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1= 2;
		int n2= 3;
		float n3= 2.0f;
		float n4= 3.0f;
		double n5= 22.0;
		double n6= 33.0;
		
		MethodOL ml=  new MethodOL();
		
		
		
		
		
		
		
		System.out.println(ml.add(n5, n6));
		System.out.println(ml.add(n5, n6));
		System.out.println(ml.add(n4, n3));
		System.out.println(ml.add(n1, n2));
		System.out.println(ml.add(n6, n5, n4));
	}

}
