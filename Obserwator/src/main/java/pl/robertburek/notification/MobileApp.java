package pl.robertburek.notification;


import pl.robertburek.order.Order;

public class MobileApp implements Observer{

    public void update(Order order) {
        System.out.println("MOBILE - zamówienie numer: "
                + order.getOrderNumber()
                + " zamieniło status na: "
                + order.getOrderStatus());
    }

}
