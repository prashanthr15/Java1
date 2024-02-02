package Project;

import java.util.Scanner;

class Rectangle{
	float length;
	float breadth;
	
	float area;
	
	public void input() {
		System.out.println("rectangle calculation");
		Scanner scan = new Scanner(System.in);
		System.out.println("kindly enter the length of rectangle");
		
		 length= scan.nextFloat();
		
		System.out.println("enter the breadth of the rectangle");
		 breadth = scan.nextFloat();
		
	}
	
	
	public void compute() {
		area = length*breadth;
		
	}
	
	
	public void disp() {
		System.out.println("the area is :" + area);
	}
}

class Square{
	float length;
//	float breadth;
	
	float area;
	
	public void input() {
		System.out.println("square calculation");
		Scanner scan = new Scanner(System.in);
		System.out.println("kindly enter the length of square");
		
		 length= scan.nextFloat();
		
//		System.out.println("enter the breadth of the rectangle");
//		float breadth = scan.nextFloat();
		
	}
	
	
	public void compute() {
		area = length*length;
		
	}
	
	
	public void disp() {
		System.out.println("the area is :" + area);
	}
}

class Circle{
//	float length;
//	float breadth;
	float radius;
	float area;
	
	public void input() {
		System.out.println("Circle calculation");
		Scanner scan = new Scanner(System.in);
		System.out.println("kindly enter the radius of Circle");
		
		 radius= scan.nextFloat();
		
//		System.out.println("enter the breadth of the rectangle");
//		float breadth = scan.nextFloat();
		
	}
	
	
	public void compute() {
//		area = length*length;
		area = 3.14f*radius*radius;
		
	}
	
	
	public void disp() {
		System.out.println("the area is :" + area);
	}
}


public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec= new Rectangle();
		Square sq= new Square();
		Circle cir= new Circle();
		
		rec.input();
		rec.compute();
		rec.disp();
		
		sq.input();
		sq.compute();
		sq.disp();
		
		cir.input();
		cir.compute();
		cir.disp();
		
		
		
		

	}

}
