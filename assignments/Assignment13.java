package assignments;
import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter the number");
		int num = keyboard.nextInt();
		if (num>0) {
			System.out.println("The number is positive");
			System.out.println("you Enter the number is: " + num );
			
		}
		else {
			System.out.println("you enter the number negative");
		}
		
	
	}

}
