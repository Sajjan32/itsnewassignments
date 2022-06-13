package assignments;
import java.util.Scanner;
public class Assignmnet24 {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in);	
	int n = keyboard.nextInt();
	
	if (n==0 || n==1) {
		n=1;
		System.out.println(" The result of is factorial is " + n);
	} else {
		n = n * (n-1);
		System.out.println(n);
	}

	}

}
