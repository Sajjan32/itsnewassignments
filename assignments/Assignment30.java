package assignments;
//Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….
import java.util.Scanner;
public class Assignment30 {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Enter the term");
	int term = keyboard.nextInt();	
	int a = 1; 
	int b =1 ;
	 int c;
	 for (int i=1;i<=term;i++) {
		 
		 System.out.print(a + " " );
		 c= a+b;
		 a = b;
		 b=c;
		 
	 }

	}

}
