package assignments;

import java.util.Arrays;

public class Assignment36 {
	public static void main(String[] args) {
	
	int arr [] = new int [] {4,3,5,6,7,8,8,9,10};
	
	
	for (int i=0;i<arr.length; i++) {
		for (int j = i+1; j <arr.length; j++) {
			if (arr[i]==arr[j]) {
				System.out.println(arr[i]);	
				Arrays.sort(arr);
				System.out.print(arr[i]);
			}
			
			 
		}
	}
	

		

	}

}
