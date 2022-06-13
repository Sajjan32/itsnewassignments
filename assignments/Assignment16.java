package assignments;
import java.util.Scanner;
public class Assignment16 {

	public static void main(String[] args) {
Scanner keyboard = new Scanner (System.in);
System.out.println("Enter the number");
int num = keyboard.nextInt();

	if (num % 2 ==0) {
		System.out.println("The number is even" );
		
	} else {
		System.out.println("The number is odd");
	}
	}

}
