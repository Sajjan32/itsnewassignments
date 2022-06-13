package assignments;

import java.util.Scanner;

public class Assignment20 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number");
		int number = input.nextInt();
		
		
		 
		 switch (number) {
		 case 1: 
			 System.out.println("This is sunday");
			 break;
		 case 2:
			 System.out.println("This is Monday");
			 break;
		 case 3:
			 System.out.println("This is Tuesday");
			 break;
		 case 4:
			 System.out.println("This is Wednesday");
			 break;
		 case 5:
			 System.out.println("This is Thursday");
			 break;
		 case 6:
			 System.out.println("This is Friday");
			 break;
		 case 7:
			 System.out.println("This is Saturday");
			 break;
			 default:
				 System.out.println("Wrong choice");
				 break;
		 }


	}

}
