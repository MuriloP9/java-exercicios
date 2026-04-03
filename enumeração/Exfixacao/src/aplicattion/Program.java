package aplicattion;

import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name, email;

        System.out.println("Enter cliente data:");
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name,  birthDate, email);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order?");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.println("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem item = new OrderItem(quantity, productPrice, product);

            order.addItem(item);
        }
        System.out.println();
        System.out.println(order);
        sc.close();




    }
}