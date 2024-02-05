import java.util.Scanner;

class Demo1{
	//throws ArithmeticException means ducking it will not handle the exce[tion .the exception is handled,by who calledthe apha()
	public void alpha() throws ArithmeticException{
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

        System.out.println("thank for using our app :");

	}
}
public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try{
		System.out.println("main method");
		Demo1 d= new Demo1();
		d.alpha();
        }
        catch(ArithmeticException e){
            System.out.println("exception is caught in main method");
        }
		
        System.out.println("main connection is trminated");
	}

}
