package conta_bancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ChoiceAccount choiceAccount = new ChoiceAccount(keyboard);
        choiceAccount.accountChoice();
    }
}