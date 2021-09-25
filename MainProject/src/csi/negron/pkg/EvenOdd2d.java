package csi.negron.pkg;

import java.util.Arrays;

public class EvenOdd2d {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[10][10];
		
		checkOddEven(arr);
		
	}
	
	public static void checkOddEven(int[][] arr) {
		boolean isEven=false;
		boolean isOdd=false;
		

		for(int i = 0; i < arr.length;i++) {
		 for(int j = 0; j < arr[i].length; j++) {
			 arr[i][j] = (int) (Math.random()*5);
			 
			 if(arr[i][j] % 2==0) {
				arr[i][j] = 0; 
			 } if(arr[i][j] % 2!=0) {
				 arr[i][j]=1;
			 }
			 
		    }
		 System.out.println(Arrays.toString(arr[i]));
		}
		
	
	}
}

