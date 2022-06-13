//Write a program that prompts the user to enter the number of students 
//and each student’s name and score. 
//Finally display the student with the highest score.

package assignments;
import java.util.Scanner;
public class Assignment25 {
	
	
	
	        public static void main(String[] args) 
	        {
	        
	         Scanner keyboard = new Scanner(System.in);
	         int NumberOfStudents;
	        
	                System.out.print("Enter the number of students: ");
	                NumberOfStudents=keyboard.nextInt();
	        
	                String[] Names = new String[NumberOfStudents];
	                double [] Scores = new double[NumberOfStudents];
	        
	           
	                int position1=0;
	                
	                
	                for(int i=0;i<NumberOfStudents;i++)
	                {
	                System.out.print("Enter a student name: ");
	                Names[i]=keyboard.next();   
	                System.out.print("Enter a student score: ");
	                Scores[i]=keyboard.nextDouble();
	                }
	                
	                
	                for(int i=0;i<NumberOfStudents;i++)
	                {
	                 
	                 
	         if(Scores[i] > Scores[position1])
	          position1=i;
	          
	                }
	                
	                System.out.println(Names[position1]+"\'s score is "+Scores[position1]);
	             
	        }
	}


