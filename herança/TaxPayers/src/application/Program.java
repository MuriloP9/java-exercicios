package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();

        List<TaxPayer> list = new ArrayList<>();

        for (int i=1; i<=n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                list.add(new Individual(name, income, health));
            }else{
                System.out.print("Number of employees: ");
                int emp = sc.nextInt();
                list.add(new Company(name, income, emp));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tp : list){
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
        }

        System.out.println();
        double soma = 0.0;
        for (TaxPayer tp : list){
            soma += tp.tax();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", soma));

        sc.close();
    }
}