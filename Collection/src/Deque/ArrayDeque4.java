package Deque;

import java.util.ArrayDeque;

/*
 * linkedlist implements two interfaces deque interface and list interface =>insert from any where using indexs
 * 
 * arraydeque implements one interface deque =>insert only rear and front using methods (index will not support)
 */
public class ArrayDeque4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque ad = new ArrayDeque();

		ad.add("Java");
		ad.addFirst(1);
		ad.addLast(3);

		System.out.println(ad);

		ArrayDeque ad1 = new ArrayDeque();

		// by default it stores at rear
		// duplicates allowed
		// insert from front end addFirst and rear end addLast
		ad1.add("Java");
		ad1.add(1);
		ad1.add(3);

		System.out.println(ad1);

	}

}
