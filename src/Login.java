import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Login extends JPanel implements ActionListener{
    public static int UserType = -1;
    JLabel pwdl;
    JLabel userl;
    JTextField username;
    JButton button,button1;
    JPasswordField pwd;
    JRadioButton buy,sell,x,y;
    Person p1;

    Login(){
        setLayout(null);

        buy = new JRadioButton("Buyer");
        buy.setBounds(500,350,120,50);

        sell = new JRadioButton("Seller");
        sell.setBounds(620,350,120,50);

        userl = new JLabel("Username");
        userl.setBounds(500, 208, 70, 20);

        username = new JTextField();
        username.setBounds(500, 227, 193, 28);

        pwdl = new JLabel("Password");
        pwdl.setBounds(500, 255, 70, 20);

        pwd = new JPasswordField();
        pwd.setBounds(500, 275, 193, 28);

        button = new JButton("Login");
        button.setBounds(500, 310, 90, 25);
        button.addActionListener(this);

        addComp();
    }
    public void addComp(){
        add(buy);
        add(sell);
        add(userl);
        add(username);
        add(pwdl);
        add(pwd);
        add(button);
        ButtonGroup ut = new ButtonGroup();
        ut.add(buy);
        ut.add(sell);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String Username = username.getText();
            String password = new String(pwd.getPassword());
            login(Username, password);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public boolean login(String username, String password) throws IOException {
        File file = null;
        if(buy.isSelected()) {
            file = new File("PTBS/src/resources/buyer.txt");
        } else if (sell.isSelected()) {
            file = new File("PTBS/src/resources/seller.txt");
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        Map<String, String> Credentials = new HashMap<>();
        String s;
        while ((s = br.readLine()) != null) {
            String[] Cred = s.split(":");
            Credentials.put(Cred[0], Cred[1]);
        }
        if (Credentials.containsKey(username) && Credentials.get(username).equals(password)) {
            System.out.println("Logged in");
            JLabel jl= new JLabel("Logged in successfully please close GUI to proceed further");
            add(jl);
            jl.setBounds(0,0,0,0);
            jl.setBounds(500,500,1000,100);
            revalidate();
            return true;
        }
        else{
            System.out.println("Invalid credentials");
            System.exit(0);
            return false;

        }
    }
}