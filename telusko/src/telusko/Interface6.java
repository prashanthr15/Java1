package telusko;

interface Shapes2{
	void input();
	void compute();
	void disp();
	void show();
}
interface Shapes3{
	
}


class Shaping {
	public void show() {
		System.out.println("show method of shaping class");
	}
}

class Rectangle extends Shaping implements Shapes2,Shapes3{
//class can implements multiple interfaces
	@Override
	
	//implementation of show mthd present here bcz it extends the cls shaping
	public void input() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void compute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Interface6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
