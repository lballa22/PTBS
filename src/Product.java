public class Product {

    private ClassProductList classProductList;
	private Trading trading;

    public String type;
    public String name;

    public Product(String[] product) {
        this.type = product[0];
        this.name = product[1];
    }
}
