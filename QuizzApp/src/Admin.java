
public class Admin {

   

    public static  void main(String args[]) {
		 Question q= new Question();
		 Question qa[]=new Question[5];
		
		qa[0]=new Question();
		qa[1]=new Question();
	    qa[2]=new Question();
		qa[3]=new Question();
		qa[4]=new Question();
		
		qa[0].id=1;
		qa[1].id=2;
		qa[2].id=3;
		qa[3].id=4;
		qa[4].id=5;
		
		qa[0].question="size of int in bytes";
		qa[1].question="size of short in bytes";
		qa[2].question="size of long in bytes";
		qa[3].question="size of float in bytes";
		qa[4].question="size of char in bytes";

		qa[0].option1=2;
		qa[0].option2=8;
		qa[0].option3=4;
		qa[0].option4=1;
		
		qa[1].option1=2;
		qa[1].option2=8;
		qa[1].option3=4;
		qa[1].option4=1;
		
		qa[2].option1=2;
		qa[2].option2=8;
		qa[2].option3=4;
		qa[2].option4=1;
		
		qa[3].option1=2;
		qa[3].option2=8;
		qa[3].option3=4;
		qa[3].option4=1;
		
		qa[4].option1=2;
		qa[4].option2=8;
		qa[4].option3=4;
		qa[4].option4=1;
		
		System.out.println(qa[0]);
		q.question1();
		System.out.println(qa[1]);
		q.question2();
		System.out.println(qa[2]);
		q.question3();
		System.out.println(qa[3]);
		q.question4();
		System.out.println(qa[4]);
		q.question5();
		Question.totalScore();
		
        }
	
	

}
