import java.util.Scanner;
import java.lang.Math;
public class Number {
	public static void main(String[] args) {
		System.out.println("Enter any Number");
		Scanner sc = new Scanner(System.in);

		
		Double number = sc.nextDouble();
		
		//Generical category of numbers
		if (number > 0) {
			System.out.println("It is a Positive number");
		} else if (number < 0) {
			System.out.println("It is a Negative number");
		} else if (number == 0) {
			System.out.println("It is 0");
		}

		
		// Decimal vs Integer (way 1)
		/* 1)
		for (int x = (int) -Math.pow(2, 31); x < Math.pow(2, 31)-1; x++) {
			if (number == x) {
				System.out.println("It is an Integer");
				break;
			} 
			
		}  
			if (number % 1 != ){
				System.out.println("It is a Decimal Number");
			}
		*/

		// Decimal vs Integer (way 2)
		if (number % 1 == 0) {
			System.out.println("It is an Integer");
		} else if (number % 1 != 0) {
			System.out.println("It is a Decimal Number");
		}

		//Divisibility of number
		int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		for (int i = 0; i < primes.length; i++) {
			if (number % primes[i] == 0)
				System.out.println("It is divisible by " + primes[i]);
		}
	}
}

