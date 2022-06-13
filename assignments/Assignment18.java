package assignments;
import java.util.Scanner;
public class Assignment18 {

	public static void main(String[] args) {
		 Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter first side");
		 int a = keyboard.nextInt();
		 System.out.println("Enter second side");
		 int b = keyboard.nextInt();
		 System.out.println("Enter third side");
		 int c = keyboard.nextInt();
		 
				

				if (a == b && b == c ) {
				   System.out.println("Equilateral Triangle");
				} else if (a == b || b == c || c == a) {
				    System.out.println("Isosceles Triangle");
				} else 
				    System.out.println("Scalene Triangle");

	}

}
