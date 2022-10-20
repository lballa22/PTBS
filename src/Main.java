import javax.swing.*;
import java.io.IOException;

public class Main extends JFrame {
    Main() throws IOException {
        Facade facade = new Facade();
        facade.setSize(2000,1000);
        facade.login(facade);
    }
    public static void main(String args[]) throws IOException {
        Main main = new Main();

    }

}
