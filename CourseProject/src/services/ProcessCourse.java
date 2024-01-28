package services;

import main.CourseList;

public class ProcessCourse {

	private CourseList course;
//setter injection
	public void setCourse(CourseList course) { //CourseList course= new CourseList();
		this.course = course;
	}
	
	//constructor injection
	public ProcessCourse(CourseList course) {
		super();
		this.course = course;
System.out.println("constructor" + course);
	}

	public boolean processCourse(double amount) {
		boolean status=course.courseChoice(amount);
		if(status) {
			System.out.println("sucessfully registered " );
		}
		else {
			System.out.println("error in registration");
		}
		return true;
	}
	
	
}
