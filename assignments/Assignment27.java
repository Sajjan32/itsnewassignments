package assignments;

public class Assignment27 {

	public static void main(String[] args) {
		int sum = 0;
		int number = 456;
		int mul =1;
		
		while (number>0) {
			int remainder = number%10;
			sum = sum+remainder;
			mul = mul * remainder;
			
			number = number/10;
		}
		
		System.out.println("The sum is " + sum);
		System.out.println("The sum is " + mul);
		
	}

}
