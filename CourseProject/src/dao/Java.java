package dao;

import main.CourseList;

public class Java implements CourseList{

	@Override
	public boolean courseChoice(double amount) {
		// TODO Auto-generated method stub
		
		System.out.println("java course is purchased with amount : " + amount);
		return true;
	}

}
