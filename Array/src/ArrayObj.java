
class Student {
	String name;
	int age;
	double avgGrades;

	public void disp() {
		System.out.println("the name " + name);
		System.out.println("the age " + age);

		System.out.println("the avgGrades " + avgGrades);

	}

	/*
	 * 
	 * Student s = new Student(); System.out.println(s); we call s it prints address
	 * of "s" after overriding the method tostring in object class o/p name :nullage
	 * :10avgGrades :0.0
	 */
//	@Override
//	public String toString() {
//		return "name :" + name + "age :" + age + "avgGrades :" + avgGrades;
//	}

}

public class ArrayObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Student s = new Student();
//		System.out.println(s);
		Student stdArr[] = new Student[4];

		stdArr[0] = new Student();
		stdArr[1] = new Student();

		stdArr[2] = new Student();

		stdArr[3] = new Student();

		stdArr[0].age = 14;
		stdArr[1].age = 14;

		stdArr[2].age = 14;

		stdArr[3].age = 14;

		stdArr[0].name = "ram";
		stdArr[1].name = "bhim";
		stdArr[2].name = "chota";
		stdArr[3].name = "mota";
//		System.out.println(stdArr[1].name);
		/*
		 * same like normal object creation calling with object reference
		 * Student s = new Student();
	        System.out.println(s.age);
	        but if we dont want to call like s.age 
	        we have to over ride the tostring method 
	        after call only eith object reference 
	        Student s = new Student();
	        System.out.println(s);
	        o/p ;name :null age:10 avgGrades :0.0
	        
		 */
		for (Student obj : stdArr) {
//			System.out.println(obj);
		}

	}

}
