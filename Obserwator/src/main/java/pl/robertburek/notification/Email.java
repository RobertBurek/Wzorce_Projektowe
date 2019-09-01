package pl.robertburek.notification;


import pl.robertburek.order.Order;

public class Email {

    public void updateOrderStatus(Order order) {
        System.out.println("E-mail - zamówienie numer: " + order.getOrderNumber() + " zamieniło status na: " + order.getOrderStatus());
    }

}
