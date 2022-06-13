package assignments;

import java.util.Scanner;

public class Assignment37 {
	public static void main(String[] args) {
		
	 
		 
	 
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter number of rows of matrix");
		int rows = keyboard.nextInt();
		System.out.println("Enter number of columns of matrix");
		int columns = keyboard.nextInt();
		int [] [] matrix1 = new int [rows][columns];
		int [] [] matrix2 = new int [rows][columns];
		int [] [] resultMatrix = new int [rows][columns];
		
		System.out.println("Enter the element for matrix1 : ");
		 for (int i=0; i<rows;i++) {
			 for(int j=0; j<columns; j++) {
				 matrix1[i][j]=keyboard.nextInt();
			 } 
		 }
		 System.out.println("The first matrix is: ");
		 for (int i=0; i<rows;i++) {
			 for(int j=0; j<columns; j++) {
				 System.out.print(" " + matrix1[i][j] + "\t");
			
			 } 
			 System.out.println();
		
		}
		 System.out.println("Enter the element for matrix2 : ");
		 for (int i=0; i<rows;i++) {
			 for(int j=0; j<columns; j++) {
				 matrix2[i][j]=keyboard.nextInt();
			 } 
		 }
		 System.out.println("The second matrix is: ");
		 for (int i=0; i<rows;i++) {
			 for(int j=0; j<columns; j++) {
				 System.out.print(" " + matrix2[i][j] + "\t");
			
			 } 
			 System.out.println();
			
		 }
		
		 for (int i=0; i<rows;i++) {
			 for(int j=0; j<columns; j++) {
				 
				 resultMatrix[i][j] = matrix1[i][j]+ matrix2[i][j];
				 
				
			 } 
		
		} 
		 System.out.println("Result matrix is: " );
		 for (int i=0;i<rows;i++) {
			 for(int j=0; j<columns; j++) {
			 
			 System.out.print(" " + resultMatrix[i][j] + "\t");
		 }
			 System.out.println();
	}
}
}
		
		
		