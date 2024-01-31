import java.util.Scanner;
/*
 * regular 2dimentional array
 * 2dimentional jagged array difference in size of array
 */
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [][] arr =new int [3][];
//	jagged array difference in size of array
	arr[0]=new int [4];
	arr[1]=new int [3];
	arr[2]=new int [2];
	
	Scanner sc = new Scanner(System.in);
	
	
	for (int i=0; i <arr.length; i++) {
		for (int j=0; j <arr[i].length; j++) {
			System.out.println("enter the marks of class :" + i + "student :" +j);
			arr[i][j]= sc.nextInt();
		}
	}
	
	System.out.println("marks stored in array are as follows :");
	for (int i= 0;i<arr.length;i++) {
		for (int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	}

}
