import java.util.*;

public class Password {
	private final String password = "Password100";
	Scanner data = new Scanner(System.in);

	public boolean isCorrect(String passcode) {
		return passcode.equals(password);
	 }

	public void verification(String passcode) {
	 	while (!isCorrect(passcode)) {
            System.out.print("Enter your password (or \"exit\" to end): ");
            passcode = data.nextLine();
            if (passcode.equals("exit")) {
                exitCommand();
            } else if (!isCorrect(passcode)) {
            	System.out.println("Incorrect Password " + passcode);
            } else {
			}
		}
	}

	public void exitCommand() {
		System.out.println("You successfully terminated the program!");
		System.exit(1);
	}
}