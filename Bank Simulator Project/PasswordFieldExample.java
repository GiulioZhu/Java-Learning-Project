import javax.swing.*;    
import java.awt.event.*;  
public class PasswordFieldExample {  
   public static void main(String[] args) {    
      JFrame frame =new JFrame("Password Field Example");  

      // Username      
      JLabel message = new JLabel("Welcome Back! Enter your Password");      
      message.setBounds(100,100, 80,30);

      // Password
      JLabel password=new JLabel("Password:");
      password.setBounds(100,155, 80,30);
      final JPasswordField value = new JPasswordField();   
      value.setBounds(180,155,100,30);   

      // Login 
      JButton login = new JButton("Login");  
      login.setBounds(180,200, 80,30);

      // Display    
      final JLabel displayLabel = new JLabel();            
      displayLabel.setBounds(100,230, 200,50);

      login.addActionListener(new ActionListener() {  
         public void actionPerformed(ActionEvent e) {       
            String data = ", Password: " + new String(value.getPassword());   
            displayLabel.setText(data);
         }  
      });

      frame.add(message); frame.add(displayLabel); frame.add(password); frame.add(login);
      frame.setSize(500,500);
      frame.setLayout(null);
      frame.setVisible(true);
}  
}  