import java.util.Scanner;

public class RoundingMechanism {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		double receivedNumber = in.nextDouble();
		int number1 = roundNumber(receivedNumber);
		System.out.println("Rounded Number = " + number1);
	}

	public static int roundNumber(double number) {
		int round = 0;
		if (number >= 0) {
			round = (int)(number + 0.5);
		}
		else if (number < 0) {
			round = (int)(number - 0.5);
		}
		return round;
	}
}