import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFormattedTextField;
import java.text.*;

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
        Bank bank = new Bank(id, initialDeposit);

        // Window Frame
        JFrame frame = new JFrame("Bank");
        frame.setSize(500, 500);
        frame.setLayout(null);
        final JLabel label = new JLabel();            
        label.setBounds(20,150, 200,50); 

        // Deposit
        JLabel depositLabel = new JLabel("Deposit Amount");
        depositLabel.setBounds(20, 20, 150, 30);
        JTextField depositBox = new JTextField();  
        depositBox.setBounds(140,20, 100,30);  
        
        JButton deposit = new JButton("deposit");
        deposit.setBounds(100, 120, 100, 30);
        deposit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (depositBox.getText().equals("")) {
                    System.out.println("You didn't deposit anything");
                    depositBox.setText("0");
                } else {
                    double depositNumber = Double.parseDouble(depositBox.getText());
                    label.setText("You deposited: " + depositBox.getText()); 
                    bank.deposit(depositNumber);    
                    depositBox.setText("");
                    bank.printCurrentTotal();
                }
            }
        });

        // Withdraw
        JLabel withdrawLabel = new JLabel("Withdraw Amount");
        withdrawLabel.setBounds(20, 60, 150, 30);
        JTextField withdrawBox = new JTextField();  
        withdrawBox.setBounds(140,60, 100,30);  
        
        JButton withdraw = new JButton("withdraw");
        withdraw.setBounds(190, 120, 100, 30);
        withdraw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (withdrawBox.getText().equals("")) {
                    System.out.println("You didn't withdraw anything");
                    withdrawBox.setText("0");
                } else {
                    double withdrawNumber = Double.parseDouble(withdrawBox.getText());
                    label.setText("You withdrew: " + withdrawBox.getText());   
                    bank.withdraw(withdrawNumber);
                    withdrawBox.setText("");
                    bank.printCurrentTotal();
                }
            }
        });

        // Exit
        JButton exit = new JButton ("exit");
        exit.setBounds(260, 40, 80, 30);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("You successfully terminated the program!");
                System.out.println("Here is your Account and Balance:");
                bank.printCurrentTotal();
                System.exit(1);
            }
        });

        // Running
        frame.add(label); frame.add(depositBox); frame.add(depositLabel); frame.add(deposit);
                          frame.add(withdrawBox); frame.add(withdrawLabel); frame.add(withdraw);
        frame.add(exit);
        frame.setVisible(true);                

    }
}