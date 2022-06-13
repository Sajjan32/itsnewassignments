package assignments;
import java.util.Scanner;
public class Assignment29 {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int fact =1; 
	int variable;
	int a =0;
	System.out.println("Enter the number:");
	int number = keyboard.nextInt();
	for(int i=1;i<=number;i++) {
		 fact = fact * i;
		 variable = number/fact;
		 a = a + variable;
		 
	}
System.out.println(a);
	}

}
