public class MeatProductMenu implements ProductMenu {
	/**
	 * This class contains MeatProductMenu items
	 */

	private final Facade facade;

	public MeatProductMenu(Facade f)
	{
		this.facade = f;
	}
	public void showMenu() {
		/**
		 * This method contains MeatProductMenu items
		 */
		System.out.println("\t\t*****Iterator Pattern*****");
		while(this.facade.theProductList.getIterator().hasNext()) {
			Product p = this.facade.theProductList.getIterator().next();
			if (p.type.equals("Meat")) {
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
