package pl.robertburek.notification;

import pl.robertburek.order.Order;

/**
 * Created by Robert Burek
 */
public interface Observer {

    void update(Order order);
}
