import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
    int userType;
    String userName;

    public boolean login() throws IOException{
        System.out.println("*****Facade Pattern*****");
        System.out.println("Please enter type of user: \n 0 -> Buyer \n 1 -> Seller");
        Scanner s = new Scanner(System.in);
        userType=s.nextInt();
        s.nextLine();
        return validateUser(userType);
    }
    public boolean validateUser(int userType) throws IOException
    {
        Scanner s = new Scanner(System.in);
        File file = null;
        if (userType == 0) {
            file = new File("./PTBS/src/resources/BuyerInfo.txt");
        }
        else{
            file = new File("./PTBS/src/resources/SellerInfo.txt");
        }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;
            Map<String, String> user = new HashMap<>();


            while ((str = br.readLine()) != null) {
                String[] credentials = str.split(":");
                user.put(credentials[0], credentials[1]);
            }

            System.out.println("Enter Username");
            String uname = s.nextLine();
            System.out.println("Enter Password");
            String pwd = s.nextLine();
            if (user.containsKey(uname) && user.get(uname).equals(pwd)) {
                System.out.println("User Logged in Successfully");
                this.userName = uname;
                return true;
            } else {
                System.out.println("Invalid Credentials");
                this.login();
                return false;
            }
        }
}
