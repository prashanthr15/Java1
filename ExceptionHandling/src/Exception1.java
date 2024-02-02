import java.util.Scanner;
/*
 * exception occur at run time 
 * error at compile time 
 * in which method exception has occured it will generate the exception obj and forward to JVM
 * jvm checks exception is handled 
 * if handled then it gives the excetion obj to handler and there is normal termination of the prog
 *  to the handle method 
 * if not handled jvm will give it to default exception hnlder and abnormal termination occured in the program execution
 */
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//try catch is user defined exception
		//developer should sense that exception would occur at run time
		//risky code should be in try block
		try {
		System.out.println("wewlcome to my app");
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the numerator to divide");
		int num1=scan.nextInt();
		
		System.out.println("enter the denominator to divide");
		int num2=scan.nextInt();
		
		int res = num1/num2;
		System.out.println("the res is  : " + res);
		}
		//based on exception we have to give same exception name or parent name
		//catch block is handler of the exception
		catch(ArithmeticException e) {
			System.out.println("the answer is 100 we know that.please give non zero values :");
		}
		
		System.out.println("thank you for using my app");
		
	}

}
