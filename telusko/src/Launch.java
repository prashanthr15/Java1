class Student{
	String name;
	int age;
	
	void disp() {
		System.out.println("student class");
	}
}
public class Launch {

	public static void main(String[] args) {
		Student std = new Student();
		
		System.out.println("launch hello");
		
		std.disp();

	}

}
