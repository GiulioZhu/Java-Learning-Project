import java.util.*;

// Later on need to incorporate the verification system innto Swing & improve UI
public class Password {
	private final String password = "Password100";

	public boolean isCorrect(String passcode) {
		return passcode.equals(password);
	 }

	public void verification(String passcode) {
	 	while (!isCorrect(passcode)) {
            // System.out.print("Enter your password (or \"exit\" to end): ");
            char[] passChar = System.console().readPassword("Enter your password (or \"exit\" to end): ");
            passcode = String.valueOf(passChar);
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