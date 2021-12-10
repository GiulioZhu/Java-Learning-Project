import java.util.*;

public class Bank
{
    private int accountID;
    private double total;
    BalanceSheet balance = new BalanceSheet();

    public Bank(int id, double initialDeposit)
    {
        balance.retrieveBalance();
        accountID = id;
        total = balance.getBalance(accountID) + initialDeposit;
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
        balance.updateBalance(accountID, total);
        balance.saveBalance();
        System.out.println("Your Account ID: " + accountID + "\nYour Account Balance: " + total);
    }
}