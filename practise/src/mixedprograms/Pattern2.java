package mixedprograms;

import java.util.Iterator;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
//				if(i==j)
//				if(i==j || i+j==n-1)
//				if(i==j || i+j==n-1 || i==0 || j==0 || i==n-1 || j==n-1)
//				if(i==j || i+j==n-1 || i+j==(n-1)/2)
//				if(i==j || i+j==n-1 || i+j==(n-1)/2 || i-j==(n-1)/2)
//				if(i==j || i+j==n-1 || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2)
				if(i==j || i+j==n-1 || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==3*(n-1)/2 || i==0 || j==0 || i==n-1 || j==n-1)
				
				
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("     ");
			System.out.print(" ");
			for(int j=0; j<n; j++) {
//				if(i==j)
//				if(i==j || i+j==n-1)
//				if(i==j || i+j==n-1 || i==0 || j==0 || i==n-1 || j==n-1)
//				if(i==j || i+j==n-1 || i+j==(n-1)/2)
//				if(i==j || i+j==n-1 || i+j==(n-1)/2 || i-j==(n-1)/2)
//				if(i==j || i+j==n-1 || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2)
//				if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==3*(n-1)/2 )
//				if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2 )
//				if(i==0&&j>0&&j<3*(n-1)/4 || j==0&&i>0&&i<3*(n-1)/4 || j==3*(n-1)/4&&i<3*(n-1)/4&&i>0 || i==3*(n-1)/4&&j>0&&j<3*(n-1)/4 || i==j&&i>=(n-1)/2 )
				
//				if (i==0 || j==0 || i==n-1 || j==n-1 || i+j<=(n-1)/2 || i-j>=(n-1)/2 || j-i>=(n-1)/2 || i+j>=(n-1)+(n-1)/2)
				if(i+j>=(n-1)/2&&i<=(n-1)/2&&j<=(n-1)/2 || i-j<=(n-1)/2&&i>=(n-1)/2&&j<=(n-1)/2 || j-i<=(n-1)/2&&j>=(n-1)/2&&i<=(n-1)/2 || i+j<=3*(n-1)/2&&j>=(n-1)/2&&i>=(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				
				
				
			}
				System.out.println();
		}
	}

}
