package assignments;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter the number");
		int a = keyboard.nextInt();
		
		System.out.println("Enter the second number");
		int b = keyboard.nextInt();
		
		if (a==b) {
			System.out.println("The number are equall");
			
		} else if (a>b) {
			System.out.println(" a is greater than b");
			
	} else {
		System.out.println("b is greater than a");
	}
		

}
}
