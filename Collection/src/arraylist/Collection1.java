package arraylist;

import java.util.*;
/*
 * every data stored in collection is stored as object
 * ArrayList==>list (Interface)==>collection(I)==>
 */
public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list= new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		System.out.println("=======================");
		
ArrayList list1= new ArrayList();
		//collection can store any type data
		list1.add(10);
		list1.add('j');
		list1.add("java");
		list1.add(10.6);
		list1.add(true);
		
		
		System.out.println(list1);
		
		//list is the parent of ArrayList
		List list2= new ArrayList();
		//can also add entire collection
		list2.addAll(list1);
		list2.add("list1  + this msg");
		
		
		System.out.println(list2);
		//in index 2 java is present replacing with springboot
		list2.add(2, "springboot");
		System.out.println(list2);
		//duplicates are allowed
		list2.add(10);
		System.out.println(list2);
		/*o/p:
		 * [10, 10, 10]
=======================
[10, j, java, 10.6, true]
[10, j, java, 10.6, true, list1  + this msg]
[10, j, springboot, java, 10.6, true, list1  + this msg]
[10, j, springboot, java, 10.6, true, list1  + this msg, 10]

		 */
		
		list2.addAll(7, list);
		System.out.println(list2);
		System.out.println(list2.get(4));
		String obj=(String) list2.get(2);
		System.out.println(list2.isEmpty());
		
		

	}

}
