import java.util.Scanner;


/*
 * array in java stores same type of data
 * a[0]=24.5;
 * Type mismatch: cannot convert from double to int
 */
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ar=new int [5];
		Scanner sc = new Scanner(System.in);
		
		//gives size of array
//		int size = ar.length;
//		System.out.println(size);
		
//		System.out.println("enter marks of student 1");
//		System.out.println("enter marks of student 2");
//		System.out.println("enter marks of student 3");
//		System.out.println("enter marks of student 4");
//		System.out.println("enter marks of student 5");
		
  //Instead use loops
//		for(int i=0; i<ar.length;i++)// length is property
//		for(int i=0; i<5;i++)
		for(int i=0; i<ar.length;i++) {
			System.out.println("enter marks of student :" + i);
			ar[i]=sc.nextInt();
			

		}
		
		System.out.println("enter marks of student which stored in array ar:");
		
//            System.out.println(ar[0]);
//            System.out.println(ar[1]);
//            System.out.println(ar[2]);
//            System.out.println(ar[3]);
//            System.out.println(ar[4]);
		
		//use the loop instead
//		for(int i=0; i<ar.length;i++)// length is property
//		for(int i=0; i<5;i++)
		//length property we use to get the length of array in java
		for(int i=0; i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}
		
	}

}
