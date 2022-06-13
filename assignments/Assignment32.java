package assignments;
import java.util.Scanner;
public class Assignment32 {

	public static void main(String[] args) {
		Scanner keyboard = new 	Scanner(System.in);
		System.out.println("Enter the element");
		 int num = keyboard.nextInt();
		int [] arr = new int [num];
	
		int sum = 0;
		
		for (int i = 0; i<arr.length; i++) {
			System.out.println("Enter the number");
			arr[i] = keyboard.nextInt();
			sum = sum + arr[i];
			
			
		}
		System.out.println(sum);
		

	}

}
