import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Action {
    String coffeeNumber;
    int waterInCoffeeMachine = 1000;
    int milkInCoffeeMachine = 200;
    int coffeeInCoffeeMachine = 50;
    int disposableCupsInCoffeeMachine = 3;
    int moneyInCoffeeMachine = 300;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void buyCoffee() throws IOException {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

        do {
            coffeeNumber = reader.readLine();

            if (coffeeNumber.equals("1")) {
                if (waterInCoffeeMachine < 250) {
                    System.out.println("\nSorry, not enough water!");
                    break;
                } else if (coffeeInCoffeeMachine < 16) {
                    System.out.println("\nSorry, not enough coffee!");
                    break;
                } else if (disposableCupsInCoffeeMachine < 1) {
                    System.out.println("\nSorry, not enough disposable cups!");
                    break;
                } else {
                    waterInCoffeeMachine = waterInCoffeeMachine - 250;
                    coffeeInCoffeeMachine = coffeeInCoffeeMachine - 16;
                    disposableCupsInCoffeeMachine = disposableCupsInCoffeeMachine - 1;
                    moneyInCoffeeMachine = moneyInCoffeeMachine + 4;

                    System.out.println("\nI have enough resources, making you a coffee!");
                    break;
                }
            } else if (coffeeNumber.equals("2")) {
                if (waterInCoffeeMachine < 350) {
                    System.out.println("\nSorry, not enough water!");
                    break;
                } else if (milkInCoffeeMachine < 75) {
                    System.out.println("\nSorry, not enough milk!");
                    break;
                } else if (coffeeInCoffeeMachine < 20) {
                    System.out.println("\nSorry, not enough coffee!");
                    break;
                } else if (disposableCupsInCoffeeMachine < 1) {
                    System.out.println("\nSorry, not enough disposable cups!");
                    break;
                } else {
                    waterInCoffeeMachine = waterInCoffeeMachine - 350;
                    milkInCoffeeMachine = milkInCoffeeMachine - 75;
                    coffeeInCoffeeMachine = coffeeInCoffeeMachine - 20;
                    disposableCupsInCoffeeMachine = disposableCupsInCoffeeMachine - 1;
                    moneyInCoffeeMachine = moneyInCoffeeMachine + 7;

                    System.out.println("\nI have enough resources, making you a coffee!");
                    break;
                }
            } else if (coffeeNumber.equals("3")) {
                if (waterInCoffeeMachine < 200) {
                    System.out.println("\nSorry, not enough water!");
                    break;
                } else if (milkInCoffeeMachine < 100) {
                    System.out.println("\nSorry, not enough milk!");
                    break;
                } else if (coffeeInCoffeeMachine < 12) {
                    System.out.println("\nSorry, not enough coffee!");
                    break;
                } else if (disposableCupsInCoffeeMachine < 1) {
                    System.out.println("\nSorry, not enough disposable cups!");
                    break;
                } else {
                    waterInCoffeeMachine = waterInCoffeeMachine - 200;
                    milkInCoffeeMachine = milkInCoffeeMachine - 100;
                    coffeeInCoffeeMachine = coffeeInCoffeeMachine - 12;
                    disposableCupsInCoffeeMachine = disposableCupsInCoffeeMachine - 1;
                    moneyInCoffeeMachine = moneyInCoffeeMachine + 6;

                    System.out.println("\nI have enough resources, making you a coffee!");
                    break;
                }
            } else if (!coffeeNumber.equals("back")) {
                System.out.println("\nError! There is no such option, try again.");
                System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            }
        } while (!coffeeNumber.equals("back"));

        System.out.println();
    }

    public void fillCoffeeMachine(Check check) {
        System.out.println("\nWrite how many ml of water do you want to add:");

        waterInCoffeeMachine = waterInCoffeeMachine + check.checkUserInput();

        System.out.println("\nWrite how many ml of milk do you want to add:");

        milkInCoffeeMachine = milkInCoffeeMachine + check.checkUserInput();

        System.out.println("\nWrite how many grams of coffee beans do you want to add:");

        coffeeInCoffeeMachine = coffeeInCoffeeMachine + check.checkUserInput();

        System.out.println("\nWrite how many disposable cups of coffee do you want to add:");

        disposableCupsInCoffeeMachine = disposableCupsInCoffeeMachine + check.checkUserInput();

        System.out.println();
    }

    public void takeMoney() {
        System.out.println("\nI gave you $" + moneyInCoffeeMachine + "\n");

        moneyInCoffeeMachine = 0;
    }

    public void showResources() {
        System.out.println("\nThe coffee machine has:\n" +
                waterInCoffeeMachine + " of water\n" +
                milkInCoffeeMachine + " of milk\n" +
                coffeeInCoffeeMachine + " of coffee beans\n" +
                disposableCupsInCoffeeMachine + " of disposable cups\n" +
                moneyInCoffeeMachine + "$ of money\n");
    }
}
