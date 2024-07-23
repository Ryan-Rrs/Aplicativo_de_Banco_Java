package conta_bancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Balance {
    private double balance;

    private ArrayList<DB> listDB;
    private Scanner keyboard;

    public Balance(ArrayList<DB> listDB, Scanner keyboard) {
        this.listDB = listDB;
        this.keyboard = keyboard;
    }

    public Balance(double initial_value) {
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance can not be negative");
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double value) {
        if (value > 0) {
            balance += value;
            System.out.println("Deposit successful. \nNew balance: " + balance);
        } else {
            System.out.println("Invalid deposit!");
        }
    }

    public void withdraw(double value) {
        if (value > 0 && balance > value) {
            balance -= value;
            System.out.println("Withdraw successful. \nNew balance: " + balance);
        } else {
            System.out.println("Invalid Withdraw value or insufficient balance");
        }
    }

    public void payPix(double value) {
        System.out.println("Type the pix key:");
        String pix_key = keyboard.nextLine();
        if (pix_key != null) {
            for (DB key_to_receive : listDB) {
                if (key_to_receive.confirmKey(pix_key)) {
                    if (value > 0) {
                        key_to_receive.setBalance(key_to_receive.getBalance() + value);
                        System.out.println("Pix was send successfully.");
                    }
                } else {
                    System.out.println("Invalid key");
                }
            }

        }

    }
}