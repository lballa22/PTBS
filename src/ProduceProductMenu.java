public class ProduceProductMenu implements ProductMenu {
	/**
	 * This class contains ProduceProductMenu items
	 */

	private final Facade facade;

	public ProduceProductMenu(Facade f)
	{
		this.facade = f;
	}

	public void showMenu() {
		/**
		 * This method shows menu of ProduceProductMenu
		 */
		System.out.println("\t\t*****Iterator Pattern*****"); //Iterator Pattern starts here
		while(this.facade.theProductList.getIterator().hasNext()) {
			Product p = this.facade.theProductList.getIterator().next();
			if (p.type.equals("Produce")) {
				System.out.println(p.name);
			}
		}
		this.facade.theProductList.getIterator().moveToHead();
	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}
}
