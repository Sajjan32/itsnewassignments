package assignments;
import java.util.Scanner;
public class Assignment17 {

	public static void main(String[] args) {
		int year;
	      System.out.println("Enter an Year : ");
	      Scanner input = new Scanner(System.in);
	      year = input.nextInt();

	      if (year % 4 == 0) 
	         System.out.println(year + " is leap year");
	      else
	         System.out.println("not a leap year");


	}

}
