package scripts;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    private ArrayList<DB> listDB;
    private Scanner keyboard;

    public Login(ArrayList<DB> listDB, Scanner keyboard) {
        this.listDB = listDB;
        this.keyboard = keyboard;
    }

    public DB login() {

        WhatToDo whatToDo = new WhatToDo(keyboard);

        System.out.println("Type your CPF: ");
        String cpfLogin = keyboard.nextLine().trim();

        System.out.println("Type your passwrod: ");
        String passwordLogin = keyboard.nextLine().trim();

        if (!cpfLogin.isEmpty() && !passwordLogin.isEmpty()) {
            for (DB person : listDB) {
                if (person.getCpf().equalsIgnoreCase(cpfLogin) && (person.confirm(passwordLogin))) {
                    System.out.println("Welcome " + person.getName() + ".");
                    whatToDo.whatToDo(person);
                    return person;
                }
            }
            System.out.println("Invalid CPF or password.");
        } else {
            System.out.println("CPF or password cannot be empty.");
        }
        return null;
    }
}
