import java.util.*;

public class BankAccount
{
    private int accountID;
    private double total;


    public BankAccount(int id, double initialDeposit)
    {
        accountID = id;
        total = initialDeposit;
    }

    public void deposit(double money)
    {
        total = total + money;
    }

    public void withdraw(double money)
    {
        total = total - money;
    }

    public void printCurrentTotal()
    {
        System.out.println("Your Account ID: " + accountID + "\nYour Account Balance: " + total);
    }
}