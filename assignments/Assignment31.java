package assignments;

public class Assignment31 {

	public static void main(String[] args) {
		int [][] jarr = new int [5][];
		
		jarr[0]= new int[1];
		jarr[0][0]=1;
		
		jarr[1]= new int[2];
		jarr[1][0]=1;
		jarr[1][1]=2;
		
		jarr[2]= new int[3];
		jarr[2][0]=1;
		jarr[2][1]=2;
		jarr[2][2]=3;
		
		jarr[3]= new int[4];
		jarr[3][0]=1;
		jarr[3][1]=2;
		jarr[3][2]=3;
		jarr[3][3]=4;
		
		jarr[4]= new int[5];
		jarr[4][0]=1;
		jarr[4][1]=2;
		jarr[4][2]=3;
		jarr[4][3]=4;
		jarr[4][4]=5;
		
		
				
		
		
		for (int i = 0; i<jarr.length; i++) {
			 for (int j=0; j<jarr[i].length; j++) {
				 System.out.print(jarr[i][j] + "");
			 }
			 System.out.println();

		

	}

}
}
