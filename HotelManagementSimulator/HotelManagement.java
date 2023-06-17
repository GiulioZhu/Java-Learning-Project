import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.*;
import java.io.*;

public class HotelManagement {
    // Security Key
    private String master = "0123";

    // Settings
    JFrame frame = new JFrame("Hotel Management");
    Font titleF = new Font("serif", Font.BOLD, 36);
    Font normal = new Font("serif", Font.PLAIN, 20);
    Font big = new Font("serif", Font.BOLD, 30);
    GridBagLayout gbl = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();

    // Variables
    List<Room> rooms = new ArrayList<Room>();

    public void run() {
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(true);
        security();
        // menu();
    }
    
    // Done
    public void security() {
        JLabel label = new JLabel("Password");
        JPasswordField value = new JPasswordField(10);
        JButton submit = new JButton("ENTER");
        JLabel error = new JLabel("");
        frame.setLayout(gbl);

        // Password
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 1; gbc.gridheight = 1;
        frame.add(label, gbc);

        gbc.gridx = 1; gbc.gridwidth = 10; gbc.weightx = 1;
        frame.add(value, gbc);

        value.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String data = new String(value.getPassword());
                    if (data.equals(master)) {
                        frame.setVisible(false);
                        frame.remove(label); frame.remove(value); frame.remove(submit); frame.remove(error);
                        frame.setLayout(null);
                        frame.setSize(1000, 1000);
                        menu();
                        load();
                    } else {
                        error.setText("Invalid");
                        value.setText(""); // reset
                        frame.pack();
                    }
                
                }
            }
            // these methods are implemented just for the sake of satisfying KeyListener() object
            public void keyTyped(KeyEvent e) {}
            public void keyReleased(KeyEvent e) {}
        });

        // Submit
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = new String(value.getPassword());
                if (data.equals(master)) {
                    frame.setVisible(false);
                    frame.remove(label); frame.remove(value); frame.remove(submit); frame.remove(error);
                    frame.setLayout(null);
                    frame.setSize(1000, 1000);
                    menu();
                    load();
                } else {
                    error.setText("Invalid");
                    value.setText(""); // reset
                    frame.pack();
                }
            }
        });
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 12;
        frame.add(submit, gbc); 

        gbc.gridy = 2; 
        frame.add(error, gbc);

        frame.pack();
        frame.setVisible(true);
    }

    // Done
    public void menu() {
        JLabel title = new JLabel("Hotel Management");
        JButton view = new JButton("Room List");
        JButton add = new JButton("Add Room");
        JButton exit = new JButton("Exit");

        title.setBounds(350, 100, 300, 100);
        title.setFont(titleF);

        add.setBounds(400, 400, 200, 100);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.remove(title); frame.remove(view); frame.remove(add); frame.remove(exit);
                addRoom();
            }
        });

        view.setBounds(400, 550, 200, 100);
        view.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.remove(title); frame.remove(view); frame.remove(add); frame.remove(exit);
                viewRooms();
            }
        });

        exit.setBounds(400, 700, 200, 100);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });


        frame.add(title); frame.add(add); frame.add(view); frame.add(exit);
        frame.setVisible(true);
    }

    public void addRoom() {
        frame.setLayout(gbl);
        JLabel room = new JLabel("Room Number");
        JLabel person1 = new JLabel("Guest 1");
        JLabel person2 = new JLabel("Guest 2");
        JLabel person3 = new JLabel("Guest 3");
        JTextField roomData = new JTextField(5);
        JTextField guest1Data = new JTextField(10);
        JTextField guest2Data = new JTextField(10);
        JTextField guest3Data = new JTextField(10);
        JButton enter = new JButton("Enter");
        JButton cancel = new JButton("Cancel");
        
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 1; gbc.gridheight = 1; gbc.weightx = 1;
        frame.add(room, gbc);

        gbc.gridx = 1; gbc.gridwidth = 3;
        frame.add(roomData, gbc);

        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 1;
        frame.add(person1, gbc);

        gbc.gridx = 1; gbc.gridwidth = 3;
        frame.add(guest1Data, gbc);
        
        gbc. gridx = 0; gbc.gridy = 2; gbc.gridwidth = 1;
        frame.add(person2, gbc);

        gbc.gridx = 1; gbc.gridwidth = 3;
        frame.add(guest2Data, gbc);

        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 1;
        frame.add(person3, gbc);

        gbc.gridx = 1; gbc.gridwidth = 3;
        frame.add(guest3Data, gbc);

        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        frame.add(enter, gbc);
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rooms.add(new Room(roomData.getText(), guest1Data.getText(), guest2Data.getText(), guest3Data.getText()));
                save();

                frame.setVisible(false); frame.setLayout(null); frame.setSize(1000, 1000);
                // remove
                frame.remove(room); frame.remove(roomData); frame.remove(person1); frame.remove(person2); frame.remove(person3); frame.remove(guest1Data);
                frame.remove(guest2Data); frame.remove(guest3Data); frame.remove(enter); frame.remove(cancel);
                menu();
            }
        });

        gbc.gridx = 1;
        frame.add(cancel, gbc);
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false); frame.setLayout(null); frame.setSize(1000, 1000);
                // remove
                frame.remove(room); frame.remove(roomData); frame.remove(person1); frame.remove(person2); frame.remove(person3); frame.remove(guest1Data);
                frame.remove(guest2Data); frame.remove(guest3Data); frame.remove(enter); frame.remove(cancel);
                menu();
            }
        });;
        frame.pack();
        frame.setVisible(true);
    }

    public void viewRooms() {
        // Menu
        JMenuBar menu = new JMenuBar();
        JMenu management =  new JMenu("Management");
        management.add(new JMenuItem("Add Room"));
        management.add(new JMenuItem("Edit Mode"));

        JMenu help = new JMenu("Help");
        help.add(new JMenuItem("Instructions"));
        
        menu.add(management);
        menu.add(help);

        // Table
        String[][] data = new String[rooms.size()][5];
        for (int i = 0; i < rooms.size(); i++) {
            Room room = rooms.get(i);
            data[i][0] = room.getRoomNum();
            for (int j = 0; j < 3; j++) {
                data[i][j+1] = room.getRoomMates().get(j);
            }
            data[i][4] = room.getRoomIssue();
        }
        String[] column = {"ROOM NUMBER", "GUEST 1", "GUEST 2", "GUEST 3", "ROOM ISSUE"};

        JTable list = new JTable(data, column);
        list.setBounds(100, 100, 800, 600);
        list.setCellSelectionEnabled(true);

        JScrollPane scroll = new JScrollPane(list);

        // UI items (misc.)
        JLabel title = new JLabel("Room Lists");
        title.setFont(big);
        title.setBounds(450, 0, 400, 100);
        
        JButton back = new JButton("Back");
        back.setBounds(450, 800, 100, 50);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                save();

                frame.setVisible(false);
                frame.remove(list); frame.remove(back); frame.remove(scroll); frame.remove(title);
                frame.setJMenuBar(null);
                menu();
            }
        });

        frame.add(list); frame.add(scroll); frame.add(back); frame.add(title);
        frame.setJMenuBar(menu);
        frame.setVisible(true);
    }

    public void save() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("./Data/rooms.csv"));
            for (int i = 0; i < rooms.size(); i++) {
                Room room = rooms.get(i);
                bw.write(room.toCSV());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void load() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("./Data/rooms.csv"));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                rooms.add(new Room(data[0], data[1], data[2], data[3]));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}


