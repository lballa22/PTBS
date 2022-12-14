import java.io.*;
import java.util.*;

public class Facade {
    /**
    * Facade Pattern Impelented in this class where Login() is called
    * */

    int UserType;

    private Product theSelectedProduct;

    private int nProductCategory;

    public ClassProductList theProductList;

    private Person thePerson;

    private String loggedInUser;

    public Facade() {
        this.theProductList = new ClassProductList();
    }

    public boolean login() throws IOException {
        /**
        * this method validates the user
        */
        boolean is_true;
        Login l = new Login();
        is_true = l.login();
        UserType = l.userType;
        loggedInUser = l.userName;
        if (UserType == 0) {
            Person b = new Buyer();
            b.showMenu();
        } else if (UserType == 1) {
            Person s = new Seller();
        }
        return is_true;
    }

    public void addTrading() {

    }

    public void viewTrading() {

    }

    public void decideBidding() {

    }

    public void discussBidding() {

    }

    public void submitBidding() {

    }

    public void remind() {

    }

    public void createUser(UserInfoItem userinfoitem) {

    }

    public void createProductList() throws IOException {
        /**
        * This method creates the product list and takes the input from the user
        */
        File file = new File("./PTBS/src/resources/ProductInfo.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            String[] product = line.split(":");
            this.theProductList.add(new Product(product));
        }
        int menuType = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\t\t*****Bridge Pattern*****"); //Bridge Pattern implementation starts here
            System.out.println("Enter menu type \n 0->View Menu \n 1->View Bidding \n 2->Sign out");
            try {
                menuType = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException n) {
                System.out.println("Invalid input please enter again");
                this.createProductList();
            }
            if (menuType == 0) {
                System.out.println("\t\t*****Factory Pattern*****"); //Factory pattern implementation starts here
                System.out.println("Please select menu type \n0->Meat \n1->Produce");
                try {
                    menuType = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException n) {
                    System.out.println("Invalid input please enter again");
                    this.createProductList();
                }
                if (menuType == 1) {
                    ProduceProductMenu p = new ProduceProductMenu(this);
                    p.showMenu();
                } else if (menuType == 0) {
                    MeatProductMenu m = new MeatProductMenu(this);
                    m.showMenu();
                }

            } else if (menuType == 1) {
                Trading t = new Trading(this);

                ReminderVisitor rv = new ReminderVisitor();
                try {
                    rv.visitTrading(t, loggedInUser);
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

            } else if (menuType == 2) {
                break;
            }
        }
    }

    public void AttachProductToUser() {

    }

    public Product SelectProduct() {
        return null;
    }

    public void productOperation() {

    }

}
