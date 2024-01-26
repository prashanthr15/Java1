package sample;
public class Sample {
int a=5; float f=10;
static int x= 2;
	public static void main(String[] args) {
		int y=3;
		Sample s1 = new Sample();
		System.out.println("print values :" + s1.a + s1.f + Sample.x);
		 
        System.out.println("print value :" +y);

	}

}
