package telusko;

public class Cal {

	int  add(int s,int t) {
		return s+t;
	} 
	double add(int s,double t) {
		return s+t;
	}
	
	double add(double s,int t) {
		return s+t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cal c=new Cal();
		double a= c.add(4, 4);
		System.out.println(a);
		
	}

}
