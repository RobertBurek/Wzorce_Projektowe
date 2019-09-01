package pl.robertburek;

import pl.robertburek.notification.Email;
import pl.robertburek.notification.MobileApp;
import pl.robertburek.notification.TextMessage;
import pl.robertburek.order.Order;
import pl.robertburek.order.OrderStatus;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(120L, OrderStatus.REALISED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        textMessage.updateOrderStatus(order);
        mobileApp.updateOrderStatus(order);
        email.updateOrderStatus(order);

    }

}
