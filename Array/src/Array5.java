
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = { 1, 2, 3, 4, 5 };// 1 d array
		System.out.println(a1.length);

		int[][] a2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };// 2d array
		System.out.println(a2.length);
		System.out.println("a2 array"+a2[2][1]);

		int[][] a3 = { { 1, 2 }, { 3, 4, 5 }, { 5 } };// 2d jagged array
		System.out.println(a3.length);
		System.out.println("a3 array"+a3[2][0]);

		int[][][] a4 = { { { 1, 2 }, { 9, 10 } }, { { 3, 4 }, { 5, 6 }, { 7, 8 } } };// 3d jagged array
		System.out.println(a4.length);
//			System.out.println(a4[1][0][0]);

		for (int i = 0; i < a4.length; i++) {
			for (int j = 0; j < a4[i].length; j++) {
				for (int k = 0; k < a4[i][j].length; k++) {
					System.out.println("enter the marks of class :" + i + "student :" + j + " " + k);

					System.out.print(a4[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
