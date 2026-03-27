package aplicattion;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter account holder: ");
        String holder = sc.nextLine();

        double withDraw;

        Account a = new Account(accountNumber, holder);

        System.out.println("Is there na initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);

        if (answer == 'y' || answer == 'Y') {
            System.out.println("Enter initial deposit value:");
            double initialDeposit = sc.nextDouble();
            a = new Account(accountNumber, holder, initialDeposit);

        } else {
            a = new Account(accountNumber, holder);
        }

        System.out.println("Account data: ");
        System.out.println(a);

        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        a.depositValue(depositValue);

        System.out.println("Updated account data: ");
        System.out.println(a);

        System.out.println("Enter a withdraw value: ");
        withDraw = sc.nextDouble();
        a.withDraw(withDraw);

        System.out.println("Updated account data: ");
        System.out.println(a);

        sc.close();
    }
}
