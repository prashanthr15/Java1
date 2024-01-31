import java.util.Arrays;

public class ArrayMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = new int[4];
		System.out.println(ar.getClass().getName()); // [I for one diementional array

		int ar1[][] = new int[4][2];
		System.out.println(ar1.getClass().getName()); // [[I for two diementional array

		int ar2[][][] = new int[4][2][3];
		System.out.println(ar2.getClass().getName()); // [[[I for 3 diamentional array

		// this methods .getClass().getName() present in parent cls objet
		// cant modify the data in array but 
		// static methods of arrays class can be used on data in an array object

		// utility means support

		int ar3[] = { 2, 9, 7, 6, 3, 5, 8 };

		for (int unsorted : ar3) {
			System.out.print(unsorted);
		}
		System.out.println();
		Arrays.sort(ar3);// static methods of arrays class can be used on data in an array object
		for (int sorted : ar3) {
			System.out.print(sorted);
		}

	}

}
