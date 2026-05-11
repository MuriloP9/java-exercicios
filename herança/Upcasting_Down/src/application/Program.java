package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {



        Account x = new Account(1020,  "Alex", 1000.0);
        Account y = new SavingsAccount(1023, 1000.0, "Maria", 00.1);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());




        BusinessAccount act = new BusinessAccount();

        Account acc = new Account(1001,"Alex", 1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        BusinessAccount bcc = new BusinessAccount(1002, 0.0, "Maria", 500.0);

        //UPCASTING
        Account acc1 = bcc;
        Account acc2 = new BusinessAccount(1003, 1000.0, "Bob", 500.0);

        Account acc3 = new SavingsAccount(1002, 1000.0, "Maria", 0.01);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
