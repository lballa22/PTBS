import java.io.IOException;
import java.util.*;
public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public boolean login() throws IOException {
		Login credentials = new Login();
		return credentials.login();
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

	public void createProductList() {

		int menuType=-1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter menu type \n 0->Meat Menu \n 1->Produce Menu");
		try{
			menuType = Integer.parseInt(sc.nextLine());
		}
		catch(NumberFormatException n){
			System.out.println("Invalid input please enter again");
			this.createProductList();
		}
		if (menuType==1)
		{
			ProduceProductMenu p = new ProduceProductMenu();
			p.showMenu();
		} else if (menuType==0) {
			MeatProductMenu m = new MeatProductMenu();
			m.showMenu();
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
