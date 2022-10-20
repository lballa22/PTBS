import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.*;
public class Facade extends JFrame {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public boolean login(Facade f){
		Login credentials = new Login();
		setLayout(new BorderLayout());
		add(credentials, BorderLayout.CENTER);
		f.setVisible(true);
		return true;
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

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}
