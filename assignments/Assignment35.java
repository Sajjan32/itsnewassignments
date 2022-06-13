package assignments;

import java.util.Arrays;

public class Assignment35 {
	
		public static void main(String[] args) {
		
		int arr [] = new int [] {4,3,5,6,7,8,8,9,10};
		int len = arr.length;
		int temp[] = new int[arr.length];
		int j=0;
		for (int i=0;i<len-1; i++) {
			
				if (arr[i]!=arr[i+1]) {
					temp [j++] = arr[i];
				}
				
				 System.out.print(arr[i] + " ");
				 
			}
		
		temp[j++] = arr [len-1];
		for ( int k=0; k<j; k++) {
			
			System.out.print(temp[k] +" ");
		}

			

		}

	
}