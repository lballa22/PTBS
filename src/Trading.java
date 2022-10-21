import java.io.File;

public class Trading {
	private final Facade facade;

	public Trading(Facade facade){
		this.facade=facade;
	}

	private Product product;

	private OfferingList offeringList;

	public void accept(NodeVisitor visitor) {

	}

}
