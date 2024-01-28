package dao;

import main.CourseList;

public class SQL implements CourseList{

	@Override
	public boolean courseChoice(double amount) {
		// TODO Auto-generated method stub
		System.out.println("SQL course is purchased with amount : " + amount);

		return true;
	}

}
