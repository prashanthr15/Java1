package dao;

import main.CourseList;

public class SpringBoot implements CourseList {

	@Override
	public boolean courseChoice(double amount) {
		// TODO Auto-generated method stub
		System.out.println("SpringBoot course is purchased with amount : " + amount);

		return true;
	}

}
