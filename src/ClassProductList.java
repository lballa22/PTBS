import java.util.ArrayList;

public class ClassProductList extends ArrayList {

	public ClassProductList() {
		this.productIterator = new ProductIterator(this);
	}

	private ProductIterator productIterator;

	private ReminderVisitor reminderVisitor;

	private Product[] product;

	public void accept(NodeVisitor visitor) {

	}

	public ProductIterator getIterator() {
		return this.productIterator;
	}
}
