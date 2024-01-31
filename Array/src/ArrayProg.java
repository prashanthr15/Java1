
public class ArrayProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = {2,5,3,4,6,1};
		int max = ar[0];
		for (int i=0; i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
			
		}
		System.out.println("the max value in array is : " + max);
		
		int min = ar[0];
		int index=0;
		for (int i=0; i<ar.length;i++) {
			if(ar[i]<min) {
				min=ar[i];
				index=i;
			}
			
		}
		System.out.println("the min value in array is : " + min + " found at index" + index);
	}

}
