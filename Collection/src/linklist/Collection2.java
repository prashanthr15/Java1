package linklist;

import java.util.LinkedList;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list= new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add('j');
		list.add("java");
		
		System.out.println(list);
		
		list.addFirst(100);
		System.out.println(list);
		
	}

}
