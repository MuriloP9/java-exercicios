package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENTS);

        System.out.println(order);
        System.out.println(os1);
        System.out.println(os2);


    }
}