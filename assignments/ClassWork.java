package assignments;
import java.util.Scanner;
public class ClassWork {
	
	
	public static void multiTable () {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of table");
		int numberOfTable = keyboard.nextInt();
		for (int i =1; i<=10; i++) {
			System.out.println(numberOfTable +"* " + i +  "=" + (numberOfTable * i) );
			
		}
		
	}
	
	public static void area () {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter the value of a");
		double a = keyboard.nextDouble();
		System.out.println("Enter the value of b");
		double b = keyboard.nextDouble();
		System.out.println("Enter the value of c");
		double c = keyboard.nextDouble();
		
		double s = (a+b+c)/2;
		
		double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area of the triangle is " + Area);
	}
	
	
}

