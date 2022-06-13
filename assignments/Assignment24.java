package assignments;
import java.util.Scanner;
public class Assignment24 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter the number:");
		int number = keyboard.nextInt();
		int fact = 1;
		 for (int i=1; i<=number; i++) {
			 fact = fact * i;
			 
		 }
		System.out.println(fact);
		

	}

}
