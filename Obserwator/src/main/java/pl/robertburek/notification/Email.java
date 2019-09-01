package pl.robertburek.notification;


import pl.robertburek.order.Order;
import pl.robertburek.order.OrderStatus;

public class Email implements Observer {

    public void update(Order order) {
        OrderStatus choice = order.getOrderStatus();
        switch (choice) {
            case ZAREJESTROWANE:
                System.out.println("EMAIL - zamówienie numer: "
                        + order.getOrderNumber()
                        + ", potwierdzam treść zamówienia.");
                break;
            case POTWIERDZONE:
                System.out.println("EMAIL - zamówienie numer: "
                        + order.getOrderNumber()
                        + ", po sprawdzeniu informuję o realizacji zamówienia.");
                break;
            case WYSŁANE:
                System.out.println("EMAIL - zamówienie numer: "
                        + order.getOrderNumber()
                        + ", powiadamiam o terminie odbioru.");
                break;
            case ODEBRANE:
                System.out.println("EMAIL - zamówienie numer: "
                        + order.getOrderNumber()
                        + ", dziękuje za odbiór.");
                break;
            default:
        }
    }
}
