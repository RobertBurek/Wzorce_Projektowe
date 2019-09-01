package pl.robertburek.notification;


import pl.robertburek.order.Order;

public class TextMessage {

    public void updateOrderStatus(Order order) {
        System.out.println("SMS - zamówienie numer: " + order.getOrderNumber() + " zamieniło status na: " + order.getOrderStatus());
    }

}
