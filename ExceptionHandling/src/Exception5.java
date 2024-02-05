import java.util.Scanner;

class Demo2{
	public void alpha() {
		try {
		System.out.println("Alpha");
		//this leads to run time error
		//alpha();
        Scanner scan= new Scanner(System.in);
        System.out.println("enter numerator to divide");
        int num1=scan.nextInt();
        System.out.println("enter dinomenator to divide");
        int num2=scan.nextInt();

        int res=num1/num2;

        System.out.println("the res is :" +res);
		}catch(ArithmeticException e) {
            System.out.println("exception is caught in alpha method");

            //e has reference address of exception obj
            //after throw no statements is executed 
            throw e;
		}
		//finally will execute if there is a exception or no exception in both cases it will executed
		//but finally will execute the statements even if throw is present
		//finally will be used for clean up purposes
		finally {
        System.out.println("thank for using our app :");

		}
		
		
	}
}
public class Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try{
		System.out.println("main method");
		Demo2 d= new Demo2();
		d.alpha();
        }
        catch(Exception e){
            System.out.println("exception is caught in main method");
        }
		
        System.out.println("main connection is trminated");
	}

}
