package mixedprograms;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int age = 79;
		
		if (age >=18 && age <=60) {
			System.out.println("ypou are goog to go");
		}
		else if (age>60) {
			System.out.println("you are not good to go");
		}
		else {
			System.out.println("not for kids");
		}
		
		int res = (10>20) ? 10+20 : 20 - 10;
		System.out.println(res);
	}

}
