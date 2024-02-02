import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		try {
System.out.println("wewlcome to my app");
		
		
		System.out.println("enter the numerator to divide");
		int num1=scan.nextInt();
		
		System.out.println("enter the denominator to divide");
		int num2=scan.nextInt();
		
		int res = num1/num2;
		System.out.println("the res is  : " + res);
		}
		catch(ArithmeticException e) {
			System.out.println("getmessage() : " +e.getMessage());
			System.out.println("toString() : " +e.toString());
			System.out.println("please give non zero denominator :" +e);
		}
		try {
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		int ar[]= new int[size];
		
		
		
		System.out.println("enter the data to instert  in array array");
         int data = scan.nextInt();
         
     		System.out.println("enter the position  of the array");

     		int pos = scan.nextInt();
     		ar[pos]=data;//ar[2]=44;
     		
     		
		}
     		
     		catch(NegativeArraySizeException e) {
    			System.out.println("no -ve array size :" +e);
    		}
		catch(InputMismatchException e) {
			System.out.println("enter integer vales only :" +e);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
 			System.out.println("position should be in range :" +e);
 		}
		
		//genric catch block should be at end 
		
		//Eexception is the super cls of all exception cls
		catch(Exception e) {
			System.out.println("invalid input try again :" +e);
		}
		
		System.out.println("all the operation is good and data is stored in array");

		
	System.out.println("thank you for using my app");
	}

}
