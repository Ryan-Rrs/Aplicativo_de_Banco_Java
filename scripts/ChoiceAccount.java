package scripts;

import java.util.Scanner;
import java.util.ArrayList;

public class ChoiceAccount {

    public Scanner keyboard;
    ArrayList<DB> listDB = new ArrayList<>();

    public ChoiceAccount(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    public void accountChoice() {

        CreteAccount createAccount = new CreteAccount(listDB, keyboard);
        Login loginAccount = new Login(listDB, keyboard);

        int account_choice = 0;
        while (account_choice != 3) {

            System.out.println("\nAccount");
            System.out.println("What do you want to do?");
            System.out.println("1 - Create Account");
            System.out.println("2 - Login on my Account");
            System.out.println("3 - Exit");

            System.out.println("Type your choice: ");
            account_choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (account_choice) {
                case 1:
                    createAccount.create();
                    break;

                case 2:
                    loginAccount.login();
                    break;

                case 3:
                    System.out.println("Leaving...");
                    break;

                default:
                    System.out.println("This option is not valid, try again.");
                    break;
            }
        }
        keyboard.close();
    }
}
