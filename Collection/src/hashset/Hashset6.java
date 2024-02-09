package hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset6 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		//anything under the set no dublicates are allowed
		//we dont know the order of values stored
		hs.add("java");
		hs.add(20);
		hs.add(30);
		//hs.add(30);
		hs.add(50);
		hs.add(4);
		hs.add(44);
		System.out.println(hs);
		
		
		LinkedHashSet hs1 = new LinkedHashSet();
		//anything under the set no dublicates are allowed
		//know the order of storeing values
		hs1.add("java");
		hs1.add(20);
		hs1.add(30);
		//hs.add(30);
		hs1.add(50);
		hs1.add(4);
		hs1.add(44);
		System.out.println(hs1);
		
	}
}
