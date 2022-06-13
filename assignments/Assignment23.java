package assignments;
import java.util.Scanner;
public class Assignment23 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the nth number");
		int n = keyboard.nextInt();
		int sum =0;
		for (int i=0;i<=n;i++) {
			 sum = sum + i;
	} 
System.out.println("Sum of nth num is " + sum);

}
}