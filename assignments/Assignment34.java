package assignments;
import java.util.Scanner;
public class Assignment34 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int num = keyboard.nextInt();
		int [] arr = new int[num];
		System.out.println("Enter an aray values");
		for(int i=0; i<arr.length;i++) {
			arr[i] = keyboard.nextInt();
		}
		int temp;// 0,1,2,3,4,5
		 int start = 0;
		 int end = num -1;
		 while (start <end) {
			 temp = arr[start];
			 arr[start]=arr[end];
			 arr[end]=temp;
			 start++;
			 end--;
			 
					 
		 }
		System.out.println("Reverse array is ");
		for (int j=0; j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}

}
