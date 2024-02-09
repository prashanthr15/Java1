package treeset;

import java.util.TreeSet;

public class Treeset5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TreeSet dont have index
		//internal it hav balance binary search tree LVR left value right
		//TreeSet =>set I =>inside set I it belongs to sortedset I
		//no dublicates
		TreeSet ts = new TreeSet();
		
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		
		System.out.println(ts);
		
	}
	


}
