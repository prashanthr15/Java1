import java.util.Scanner;

class UnderAgeException extends Exception{
	
	public UnderAgeException(String msg) {
		super(msg);
	}
}

class OverAgeException extends Exception{
public OverAgeException(String msg) {
	    super(msg);
	}
}

class Applicant{
	int age;
	
	public void input() {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your agfe");
		age = scan.nextInt();
	}
	
	public void verify() throws UnderAgeException, OverAgeException {
		if(age<18) {
			
			throw new UnderAgeException("not eligble to apply for license");
		}
		else if(age>70){
			
			throw new OverAgeException("not eligble to apply for license");

			
		}else {
			System.out.println("you are eligible to apply for license");
		}
	}
}

class RTO{
	
	public void initiate() {
		Applicant app= new Applicant();
		
		try {
			app.input();
			app.verify();
		}catch(UnderAgeException uae) { //catch(UnderAgeException uae | OverAgeException oae)
			System.out.println(uae.getMessage());
			try {
				app.input();
				app.verify();
			}catch(UnderAgeException uae1) {
				System.out.println(uae1.getMessage());
			}
			catch(OverAgeException oae1) {
				System.out.println(oae1.getMessage());

			}
		}
		catch(OverAgeException oae) {
			System.out.println(oae.getMessage());
			try {
				app.input();
				app.verify();
			}catch(UnderAgeException uae2) {
				System.out.println(uae2.getMessage());
			}
			catch(OverAgeException oae2) {
				System.out.println(oae2.getMessage());

			}

		}
	}
	
}

public class Exception7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RTO rto = new RTO();
		rto.initiate();
	}

}
