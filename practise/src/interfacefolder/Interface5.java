package interfacefolder;
interface Super{
	
	void show();
}

interface Demo5 extends Super{
	void disp();
}

class Demo6 implements Demo5, Super{
//interface can implements another interface "no"
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

public void java() {
	
}

	
	
}

public class Interface5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super s;
		Demo6 d6= new Demo6();
		s=d6;
		
	}

}
