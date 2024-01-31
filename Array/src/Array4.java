
public class Array4 {
/*
 * no negative values,
 * array size is fixed will not grow or sink
 * int arr[]= new int [3]; to int arr[]= new int [4];
 * if we increase the size of same array it creates the new array but not increase the same array
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= new int [3];
		arr[0]= 10;
		arr[1]= 10;
		arr[2]= 10;
//		arr[3]= 10;java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//		at Array4.main(Array4.java:11)
		System.out.println("within boundary");
	}

}
