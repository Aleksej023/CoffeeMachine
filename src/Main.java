import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        Check check = new Check();
        Action action = new Action();

        menu.selectMenuItem(action, check);
    }
}
