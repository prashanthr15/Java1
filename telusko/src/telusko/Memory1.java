package telusko;

class Demo {
	
//	instance variables
	int a;
	double b;
	
	void disp() {
		a=10;
		b=22;
		System.out.println(a);
		System.out.println(b);
	}
}


class Demo1 {
	
int age;
	
	void disp() {
		
//		there is no default vales for local variables
		int aa=101;
		int bb=229;
		System.out.println(aa);
		System.out.println(bb);
	}
	
	void alpha() {
		age=20;
		System.out.println(age);
	}
}

public class Memory1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d= new Demo();
		d.disp();

		Demo1 d1 = new Demo1();
		d1.disp();
		d1.alpha();
	}

}
