package mixedprograms;

public class Calculator {

	int num1, num2, res, ress;

	void add() {
		num1 = 10;
		num2 = 20;
		res = num1 + num2;
		System.out.println(res);
	}

//parameters
	void add(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		res = num1 + num2;
		System.out.println(res);
	}

	int addd() {
		num1 = 10;
		num2 = 20;
		res = num1 + num2;
		return res;
	}

	int addd(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		ress = num1 + num2;
		return ress;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator clc = new Calculator();
		clc.add();
//		arguments
		clc.add(22, 33);
		int result = clc.addd();
		int resultt = clc.addd(234563, 856657);
		System.out.println(result + " " + resultt);
		
	}

}
