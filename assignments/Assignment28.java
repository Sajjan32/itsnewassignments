package assignments;
import java.util.Scanner;
public class Assignment28 {
	
	
	public void isPrimenumber(int num) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number");
		num =keyboard.nextInt();
		int count = 0;
		
		for (int i = 1;i<=num;i++) {
			if (num%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("The " + num + "is prime number");
			
		} else 
		{
			System.out.println("The " + num + " is not prime number");
		}
		 	
		
	}
	

	public static void main(String[] args) {
		
		Assignment28 o = new Assignment28();
		o.isPrimenumber(0);
		
	}

}
