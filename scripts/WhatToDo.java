package conta_bancaria;

import java.util.Scanner;

public class WhatToDo {
    private Scanner keyboard;

    public WhatToDo(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    public void whatToDo(DB account) {

        int option = 0;
        while (option != 5) {
            System.out.println(
                    "Type the option that you want to do: \n\n1 - Show Balance\n2 - Deposit\n3 - Withdraw\n4 - Pix Payment\n5 - Exit\n\n");
            option = keyboard.nextInt();
            keyboard.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Your Balance: " + account.getBalance());
                    break;

                case 2:
                    System.out.println("Type the value that you want to deposit: ");
                    double valueToDeposit = keyboard.nextDouble();
                    account.deposit(valueToDeposit);
                    break;

                case 3:
                    System.out.println("Type the value that you want to withdraw: ");
                    double valueToWithdraw = keyboard.nextDouble();
                    account.withdraw(valueToWithdraw);
                    break;

                case 4:
                    System.out.println("Type the value that you want to pay: ");
                    double valueToPayByPix = keyboard.nextDouble();
                    account.payPix(valueToPayByPix);
                    break;

                case 5:
                    System.out.println("Leaving...");
                    break;

                default:
                    System.out.println("This option is not valid! Try again.");
                    break;
            }
        }
    }
}