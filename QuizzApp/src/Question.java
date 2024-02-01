import java.util.Scanner;

public class Question {

	int id;
	String question;
	 int answer1=4,answer2=2,answer3=8,answer4=4,answer5=2 ;
	int option1;
	int option2;
	int option3;
	int option4;
	static int count;
	

	@Override
	public String toString(){
		return "id :" + id + 
				" question : "+question+
				" a: " +option1 +
				" b: " +option2 +
				" c: " +option3+
				" d: " +option4 
				;
		
	}
	
	void question1() {
		
		Scanner s= new Scanner(System.in);
		int	answer = s.nextInt();
		System.out.println("answer :"+answer);
		
		if (answer== answer1) {
			System.out.println("correct answer" +answer1  );
			count=count+2;
		}else {
			System.out.println("wrong answer");
			count --;
		}
		
	}
	
	
	
	void question2() {
		Scanner s= new Scanner(System.in);
		int	answer = s.nextInt();
		System.out.println("answer :"+answer);
		
		if (answer== answer2) {
			System.out.println("correct answer" +answer2  );
			count=count+2;
		}else {
			System.out.println("wrong answer");
			count --;
		}
	}
	
	void question3() {
		Scanner s= new Scanner(System.in);
		int	answer = s.nextInt();
		System.out.println("answer :"+answer);
		
		if (answer== answer3) {
			System.out.println("correct answer" +answer3  );
			count=count+2;
		}else {
			System.out.println("wrong answer");
			count --;
		}
	}
	
	void question4() {
		Scanner s= new Scanner(System.in);
		int	answer = s.nextInt();
		System.out.println("answer :"+answer);
		
		if (answer== answer4) {
			System.out.println("correct answer" +answer4  );
			count=count+2;
		}else {
			System.out.println("wrong answer");
			count --;
		}
	}
	void question5() {
		Scanner s= new Scanner(System.in);
		int	answer = s.nextInt();
		System.out.println("answer :"+answer);
		
		if (answer== answer5) {
			System.out.println("correct answer" +answer5  );
			count=count+2;
		}else {
			System.out.println("wrong answer");
			count --;
		}
	}
	
	static void totalScore() {
		System.out.println("your total score is :" +count);
	}
	
}
