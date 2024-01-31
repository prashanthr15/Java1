
public class ArrayFEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 4, 5, 6, 7 };
		double dar[] = {1.2,5.5,3.4,4.4};
//		System.out.println(arr[0]);//2
//		System.out.println(arr[1]);//4
//
//		for (int i =0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		// for each loop or enhance loop or advance loop
		// collection or list is there to fetch from start to end then we use this loop
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		double sum=0;
		for (double el : dar) {
			System.out.print(el + " ");
			sum = sum+el;
		}
		System.out.println(sum);
		
		
		int [][] ar1= {{2,4,6,8},{1,3,5,7,9}};
		for(int data1[]:ar1) {
			for(int data2:data1) {
				System.out.print(data2 + " ");

			}
			System.out.println();
		}
	}

}
