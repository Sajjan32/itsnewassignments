



//Write a Program to reverse the given number. //123 => 321

package assignments;
import java.util.Scanner;
public class Assignment26 {


		
			   static void reverseNumber() {
			       Scanner keyboard = new Scanner(System.in); 
			       System.out.println("Enter a number");
			       int number = keyboard.nextInt(); // 
			      
			       String num = Integer.toString(number);
			      
			       StringBuffer sb = new StringBuffer(num);
			       
			       int reverse = Integer.parseInt(sb.reverse().toString());
			       System.out.println(reverse); 
			   }

			   public static void main(String aa[]) {
			       reverseNumber(); 
			   }
			

	}


