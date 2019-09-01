package pl.robertburek;

import pl.robertburek.notification.Email;
import pl.robertburek.notification.MobileApp;
import pl.robertburek.notification.Stock;
import pl.robertburek.notification.TextMessage;
import pl.robertburek.order.Order;
import pl.robertburek.order.OrderStatus;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(120L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();
        Stock stock = new Stock("Magazyn 1");

//        textMessage.updateOrderStatus(order);
//        mobileApp.updateOrderStatus(order);
//        email.updateOrderStatus(order);

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);
        order.registerObserver(stock);

        order.notifyObservers();

        System.out.println("----Magazyn sprawdził i zmienił status-------------------------");
        order.setOrderStatus(stock.stanStock(order));
        stock.update(order);
        System.out.println("--------------NOTIFYOBSERVERS-----------------------------------");
        order.notifyObservers();


        System.out.println("------Dystrybucja i usunięcie observatora email-----------------");
        order.changeOrderStatus(OrderStatus.WYSŁANE);
        order.unregisterObserver(email);
        System.out.println("----------------------------------------------------------------");
        order.changeOrderStatus(OrderStatus.ODEBRANE);

    }

}
