import java.util.*;

public class Bank
{
    private int accountID;
    private double total;


    public Bank(int id, double initialDeposit)
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