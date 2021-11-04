import java.util.*;

public class Password {
	final String password = "Password100";
	Scanner data = new Scanner(System.in);

	public boolean isCorrect(String passcode) {
		return passcode.equals(password);
	 }
}