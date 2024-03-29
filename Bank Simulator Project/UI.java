import javax.swing.*;
import java.awt.event.*;

public class UI {
	public void run(Bank bank) {
		// Welcome Message 
        bank.printCurrentTotal();
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
                    float depositNumber = Float.parseFloat(depositBox.getText());
                    label.setText("You deposited: " + depositBox.getText()); 
                    bank.deposit(depositNumber);    
                    depositBox.setText("");
                    bank.printCurrentTotal();
                    bank.update();
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
                    float withdrawNumber = Float.parseFloat(withdrawBox.getText());
                    label.setText("You withdrew: " + withdrawBox.getText());   
                    bank.withdraw(withdrawNumber);
                    withdrawBox.setText("");
                    bank.printCurrentTotal();
                    bank.update();
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
        frame.add(label); frame.add(depositBox); frame.add(depositLabel); frame.add(deposit);
                  frame.add(withdrawBox); frame.add(withdrawLabel); frame.add(withdraw);
        frame.add(exit);
        frame.setVisible(true);
	}


}