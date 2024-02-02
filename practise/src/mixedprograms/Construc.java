package mixedprograms;

class Employee{
	
	private int id;
	private String name;
	private int age;


Employee(int id, String name, int age){
	this(10);
	this.id=id;
	this.age=age;
	this.name=name;
	
	
}
Employee(){
	System.out.println("conntect to database");
	System.out.println("zero parameters");
}

Employee(int id){
	this();
	System.out.println("conntect to database");
	System.out.println("parameter parameters" + id);
}

void disp() {
	System.out.println(id);
	System.out.println(age);
	System.out.println(name);
}

}

public class Construc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp= new Employee(1,"rohan", 18);
//		Employee e= new Employee();
		emp.disp();
	}

}
