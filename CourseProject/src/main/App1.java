package main;

import dao.Java;
import dao.SQL;
import dao.SpringBoot;
import services.ProcessCourse;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructor injection
		ProcessCourse pc = new ProcessCourse(new Java());
		pc.processCourse(50);
//		ProcessCourse pc = new ProcessCourse();
		//dependency injection through the setter 
		//dependency injection
		pc.setCourse(new Java());
//		pc.processCourse(50);
		pc.setCourse(new SpringBoot());
		pc.processCourse(60);
		pc.setCourse(new SQL());
//		pc.processCourse(100);
		
		
	}

}
