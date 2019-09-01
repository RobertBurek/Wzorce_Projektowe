package pl.robertburek.notification;


import pl.robertburek.order.Order;
import pl.robertburek.order.OrderStatus;

public class TextMessage implements Observer{

    public void update(Order order) {

        OrderStatus choice =order.getOrderStatus();
        switch (choice) {
            case ZAREJESTROWANE:
                System.out.println("SMS - zamówienie numer: "
                        + order.getOrderNumber()
                        + ", nic nie robimy");
                break;
            case POTWIERDZONE:
                System.out.println("SMS - zamówienie numer: "
                        + order.getOrderNumber()
                        + ", zamawiam kuriera");
                break;
            case WYSŁANE:
                System.out.println("SMS - zamówienie numer: "
                        + order.getOrderNumber()
                        + ", wysyłam SMS-a do klienta");
                break;
            case ODEBRANE:
                System.out.println("SMS - zamówienie numer: "
                        + order.getOrderNumber()
                        + ", dziękuje za odbiór.");
                break;
            default:
        }
    }

}
