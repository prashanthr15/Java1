package project2;
//https://github.com/haripriyaMannem/RewardsApp
//roopaitagi/QuizzAPP_Telusko_Team_Float
import java.util.Scanner;

//inheritance
//polymorphism runtime
//over riding
//abstract class
//abstract methods and concrete methods

abstract class Shapes {
	float area;

	abstract void input();

	abstract void compute();

	void disp() {
		System.out.println("the area is :" + area);
	}

}

class Rectangle extends Shapes {
	float length;
	float breadth;

	public void input() {
		System.out.println("rectangle calculation");
		Scanner scan = new Scanner(System.in);
		System.out.println("kindly enter the length of rectangle");

		length = scan.nextFloat();

		System.out.println("enter the breadth of the rectangle");
		breadth = scan.nextFloat();

	}

	public void compute() {
		area = length * breadth;

	}

//	void disp() {
//		System.out.println("the area is :" + area);
//	}
}

class Square extends Shapes {
	float length;

	public void input() {
		System.out.println("square calculation");
		Scanner scan = new Scanner(System.in);
		System.out.println("kindly enter the length of square");

		length = scan.nextFloat();
	}

	public void compute() {
		area = length * length;

	}

//	void disp() {
//		System.out.println("the area is :" + area);
//	}
}

class Circle extends Shapes {
	float radius;

	public void input() {
		System.out.println("Circle calculation");
		Scanner scan = new Scanner(System.in);
		System.out.println("kindly enter the radius of Circle");

		radius = scan.nextFloat();
	}

	public void compute() {
//		area = length*length;
		area = 3.14f * radius * radius;

	}

//	void disp() {
//		System.out.println("the area is :" + area);
//	}

}

class Geomentry {

	void permit(Shapes shape) {
		shape.input();
		shape.compute();
		shape.disp();
	}
}

public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rec = new Rectangle();
		Square sq = new Square();
		Circle cir = new Circle();

		Geomentry g = new Geomentry();

		g.permit(rec);
		g.permit(sq);
		g.permit(cir);

	}

}
