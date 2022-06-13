package assignments;
import java.util.Scanner;
public class ClassWork1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		String decision = "";
		do {
			System.out.println(" Enter the operation  Area || Multitable");
			String operation = keyboard.next();
			
			switch(operation) {
			case "Area":
				ClassWork.area();
				break;
				
			case "Multitable":
				ClassWork.multiTable();
				break;
				
				default:
					System.out.println("Wrong Choice");
					break;
			}
			
			System.out.println("Would you like to try again press Y||N");
			decision = keyboard.next();
			
		} while (decision.equalsIgnoreCase("Y"));
		
		
			
			

	
		

	}

}
