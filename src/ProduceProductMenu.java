public class ProduceProductMenu implements ProductMenu {

	private final Facade facade;

	public ProduceProductMenu(Facade f)
	{
		this.facade = f;
	}

	public void showMenu() {
		System.out.println("*****Iterator Pattern*****");
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
