package telusko;
class Animal1{
	int age;
	Animal1(){
		this(3);
		age=2;
		System.out.println("zero parameter animal constructor" + age);
	}
Animal1(int age){
		this.age=age;
		System.out.println("animal parameter constricter" +age);
	}
}
class Lion extends Animal1{
	
	int noOfLegs;
	
	Lion(){
		
		System.out.println("zero parameter lion constructor" + age);
	}
	
	Lion(int noOfLegs){
		this();
		this.noOfLegs=noOfLegs;
		System.out.println("lion parameter lion constructor" + noOfLegs);
	}
	
	void disp() {
		System.out.println(age);
		System.out.println(noOfLegs);
	}
}


public class Inheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Lion l= new Lion();
		Lion l1= new Lion(5);
		l1.disp();
	}

}
