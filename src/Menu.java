import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    String choiceOfAction;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void selectMenuItem(Action action, Check check) throws IOException {
        System.out.println("Write action (buy, fill, take, resources, exit):");

        choiceOfAction = reader.readLine();

        while (!choiceOfAction.equals("exit")) {
            if (choiceOfAction.equals("buy")) {
                action.buyCoffee();
                selectMenuItem(action, check);
            } else if (choiceOfAction.equals("fill")) {
                action.fillCoffeeMachine(check);
                selectMenuItem(action, check);
            } else if (choiceOfAction.equals("take")) {
                action.takeMoney();
                selectMenuItem(action, check);
            } else if (choiceOfAction.equals("resources")) {
                action.showResources();
                selectMenuItem(action, check);
            } else {
                System.out.println("\nError! There is no such action, try again.\n");
                selectMenuItem(action, check);
            }
        }
    }
}
