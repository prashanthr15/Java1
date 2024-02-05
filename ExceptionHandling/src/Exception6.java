import java.util.Scanner;
//custom exception 
class InvalidUserException extends Exception{
	public InvalidUserException(String msg) {
		super(msg);
	}
	
}
class Atm{
	private int acc_num=1111;
	private int password = 2222;
	
	int acNo;
	int pw;
	
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your accnum");
		acNo= scan.nextInt();

		System.out.println("enter your pin");
		pw= scan.nextInt();
		
		
	}
	
	public void verify() throws InvalidUserException {
		if(acc_num==acNo && password==pw) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("enter your amonut required");
			int amount= scan.nextInt();

			System.out.println("collect your cash" +amount);
		
			
		}else {
			System.out.println("are you sure this is your own card");
			//throw new InvalidUserException();
			//InvalidUserException iue= newInvalidUserException();
			//System.out.println("wrong credentials");
			//throw iue;
			throw new InvalidUserException("wrong credentials are you sure this is your own card");
			
			
		}     
	}
}
class Bank{
	
	public void initiate() {
		
		System.out.println("welcome to teluskoo bank");
		Atm atm= new Atm();
		//1 time try catch
		try {
		atm.acceptInput();
		atm.verify();
		}
		catch(InvalidUserException e) {
			System.out.println(e.getMessage());
			//2 time try catch
			try {
				atm.acceptInput();
				atm.verify();
				}
				catch(InvalidUserException e2) {
					System.out.println(e2.getMessage());
					//3 time try catch
					try {
						atm.acceptInput();
						atm.verify();
						}
						catch(InvalidUserException e3) {
							System.out.println(e3.getMessage());
							System.out.println("you are blocked now");
						}
				}
		}
	}
	
}


public class Exception6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Bank();
		b.initiate();
	}

}
