package assignments;
import java.util.Scanner;
public class Assignment19 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("enter number a: ");
		
		
		int a = keyboard.nextInt();
		System.out.println("enter number b: ");
		int b = keyboard.nextInt();
		System.out.println("enter number c: ");
		int c= keyboard.nextInt();
		
		if (a>b ) {
			if (a>c) {
			System.out.println("a is the largest");
			
		} else { 
			System.out.println("c is the largest");
		
		} 
		}
			else {
			if (a>c ) {
				System.out.println("b is the largest");
		
			
		} else {
			System.out.println(" a is smallest one");
		}
	}
	}
}
	






