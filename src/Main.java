import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        /**
         * Main method
         */
        Facade f = new Facade();
        f.login();
        f.createProductList();
    }

}
