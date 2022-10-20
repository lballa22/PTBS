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
    JLabel passwordl;
    JLabel userl;
    JTextField username;
    JButton button,button1;
    JPasswordField Password;
    JRadioButton b,se,x,y;
    Person p1;

    Login(){
        setLayout(null);

        b = new JRadioButton("Buyer");
        b.setBounds(100,150,120,50);

        se = new JRadioButton("Seller");
        se.setBounds(250,150,120,50);

        userl = new JLabel("Username");
        userl.setBounds(100, 8, 70, 20);

        username = new JTextField();
        username.setBounds(100, 27, 193, 28);

        passwordl = new JLabel("Password");
        passwordl.setBounds(100, 55, 70, 20);

        Password = new JPasswordField();
        Password.setBounds(100, 75, 193, 28);

        button = new JButton("Login");
        button.setBounds(100, 110, 90, 25);
        button.addActionListener(this);

        addComp();
    }
    public void addComp(){
        add(b);
        add(se);
        add(userl);
        add(username);
        add(passwordl);
        add(Password);
        add(button);
        ButtonGroup ut = new ButtonGroup();
        ut.add(b);
        ut.add(se);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String Username = username.getText();
            String password = new String(Password.getPassword());
            login(Username, password);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public boolean login(String username, String Password) throws IOException {
        File file = null;
        if(b.isSelected()) {
            file = new File("PTBS/src/resources/buyer.txt");
        } else if (se.isSelected()) {
            file = new File("PTBS/src/resources/seller.txt");
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        Map<String, String> Credentials = new HashMap<>();
        String s;
        while ((s = br.readLine()) != null) {
            String[] Cred = s.split(":");
            Credentials.put(Cred[0], Cred[1]);
        }
        if (Credentials.containsKey(username) && Credentials.get(username).equals(Password)) {
            System.out.println("Logged in");
            JLabel jl= new JLabel("Logged in successfully please close GUI to proceed further");
            add(jl);
            jl.setBounds(500,500,100,100);
            revalidate();
            return true;
        }
        return true;
    }
}