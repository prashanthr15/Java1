package mixedprograms;

public class Student {

	private int id;
	private int marks;
	private String name;

//binding of variable and method is called encapsulation
	void setshow(Student s,int id) {
//		Student s=new Student();
		s.id = id;
//to differnciate b/w local and instance variables we have to pass object (Student s1) while calling the method s.setshow(s, 63); Student s = new Student();
//		so jvm will pass the object  as "this" .so this .id=id
//	System.out.println(id);
	}

	int getshow() {

		return id;
	}
}
