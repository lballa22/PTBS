import java.io.*;

public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public void visitProduct(Product product) {

	}

	public void visitTrading(Trading trading, String loggedInUser) throws IOException {
		/**
		 * This method shows the products of user to be traded
		 */
		File file = new File("./PTBS/src/resources/UserProduct.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			System.out.println("\t\t*****Visitor Pattern*****"); // Visitor Pattern implementation starts here
		System.out.println("Products to be traded for "+loggedInUser);
			while ((line = br.readLine()) != null) {
				String[] split = line.split(":");
				if (split[0].equals(loggedInUser)) {
					System.out.println(split[1]);
				}
			}



	}

	public void visitFacade(Facade facade) {

	}

}

