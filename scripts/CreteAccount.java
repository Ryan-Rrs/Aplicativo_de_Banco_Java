package scripts;

import java.util.ArrayList;
import java.util.Scanner;

public class CreteAccount {
    private Scanner keyboard;
    private ArrayList<DB> listDB;

    public CreteAccount(ArrayList<DB> listDB, Scanner keyboard) {
        this.listDB = listDB;
        this.keyboard = keyboard;
    }

    public void create() {

        String firstPerson = "00000000000";
        String firstCPF = "00000000000";
        String firstPassword = "00000000000";
        double firstBalance = 0;
        String firstKey = "00000000000";

        listDB.add(new DB(firstPerson, firstCPF, firstPassword, firstBalance, firstKey));

        System.out.println("Create Account\n");
        System.out.println("Type the name that you want to create your account: ");
        String newPerson = keyboard.nextLine();

        System.out.println("Type your CPF:");
        String newCPF = keyboard.nextLine();

        System.out.println("Type your passaword: ");
        String newPassword = keyboard.nextLine();

        System.out.println("Type your pix key: (e-mail, cpf or number)");
        String newKey = keyboard.nextLine();

        double newBalance = 0;

        for (DB cpf_check : listDB) {
            if (cpf_check.getCpf().equalsIgnoreCase(newCPF)) {
                System.out.println("User already has an account");
            } else {
                listDB.add(new DB(newPerson, newCPF, newPassword, newBalance, newKey));
                System.out.println("User created successfully!");
            }
            break;
        }

    }
}
