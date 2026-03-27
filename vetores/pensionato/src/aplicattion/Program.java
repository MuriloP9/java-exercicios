package aplicattion;

import entities.Rent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        Rent[] vect = new Rent[10];


        for (int i = 1; i <= n; i++){
            System.out.println("Rent #" + i + ":");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);

        }
        System.out.println();
        System.out.println("Busy rooms:");
        for(int i = 0; i < 10; i++){
            if (vect[i] != null){
                System.out.println( i + ": " + vect[i]);
            }


        }

    }


}
