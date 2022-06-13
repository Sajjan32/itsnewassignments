package assignments;
import java.util.Scanner;
public class Assignment33 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int num = keyboard.nextInt();
		int a[] = new int [num];
				System.out.println("Enter elements in aray");
		for (int i=0;i<a.length;i++)
		{
			a[i] = keyboard.nextInt();
		}
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}
