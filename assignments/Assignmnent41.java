package assignments;
import java.util.Scanner;

public class Assignmnent41 {
 
	    public static void main(String[] args) {    
	    	Scanner keyboard = new Scanner (System.in);
	    	String string = keyboard.next();
	    	  int count = 0;
	    	  char[] inp = string.toCharArray();
	    	  System.out.println("Duplicate Characters are:");
	    	  for (int i = 0; i < string.length(); i++) {
	    	   for (int j = i + 1; j < string.length(); j++) {
	    	    if (inp[i] == inp[j]) {
	    	     System.out.println(inp[j]);
	    	     count++;
	    	     break;
	    	    }
	    	   }
	    	  }
	    	 }
	    	}