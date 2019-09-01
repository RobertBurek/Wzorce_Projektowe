package pl.robertburek.notification;

import pl.robertburek.order.Order;
import pl.robertburek.order.OrderStatus;

/**
 * Created by Robert Burek
 */
public class Stock implements Observer {

    private String name;

    public Stock(String name) {
        this.name = name;
    }

    public OrderStatus stanStock(Order order){
        //sprawdza stan w magazynie
        return OrderStatus.POTWIERDZONE;
    }

    public void update(Order order) {
        OrderStatus choice =order.getOrderStatus();
        switch (choice) {
            case ZAREJESTROWANE:
                System.out.println("STOCK - zamówienie numer: "
                        + order.getOrderNumber()
                        + ", sprawdzam stan magazynowy.");
                break;
            case POTWIERDZONE:
                System.out.println("STOCK - zamówienie numer: "
                        + order.getOrderNumber()
                        + ", przygotowuję do wysyłki.");
                break;
            case WYSŁANE:
                System.out.println("STOCK - zamówienie numer: "
                        + order.getOrderNumber()
                        + ", oczekuje na nowe zamówienie.");
                break;
            case ODEBRANE:
                System.out.println("STOCK - zamówienie numer: "
                        + order.getOrderNumber()
                        + ", nic nie robię.");
                break;
            default:
        }
    }
}
