public class Bank
{
    private int accountID;
    private float total;
    BalanceSheet balance = new BalanceSheet();
    DatabaseConnection connect = new DatabaseConnection(accountID, total);

    public Bank(int id, float initialDeposit)
    {
        balance.retrieveBalance();
        accountID = id;
        total = balance.getBalance(accountID) + initialDeposit;
    }

    public void update() {
        connect.update();
    }
    
    public void deposit(float money)
    {
        total = total + money;
    }

    public void withdraw(float money)
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