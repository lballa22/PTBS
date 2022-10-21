public class ProductIterator implements ListIterator {

	private ClassProductList classProductList;
	private int head;

	public ProductIterator(ClassProductList productList) {
		this.classProductList = productList;
		this.head = 0;
	}

	public boolean hasNext() {
		return head < this.classProductList.size();
	}

	public Product next() {
		if (this.hasNext()) {
			Product p = (Product) this.classProductList.get(head);
			head++;
			return p;
		}
		return null;
	}

	public void moveToHead() {
		this.head=0;
	}

	public void remove() {

	}

}
