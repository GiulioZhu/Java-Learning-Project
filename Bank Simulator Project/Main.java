import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        // Password Security need to be created prior to lauching window
        Scanner data = new Scanner(System.in);
        Password password = new Password();
        String passcode = "";
        password.verification(passcode);

        // End of Password Security check, program bank initialization
        System.out.print("Welcome back! please enter your ID: ");
        int id = data.nextInt();
        System.out.print("Enter your initial deposit: ");
        double initialDeposit = data.nextDouble();
        data.close();
        Bank bank = new Bank(id, initialDeposit);

        UI ui = new UI();
        ui.run(bank);
    }
}