public class MeatProductMenu implements ProductMenu {

	private final Facade facade;

	public MeatProductMenu(Facade f)
	{
		this.facade = f;
	}
	public void showMenu() {
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
