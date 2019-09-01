package pl.robertburek.order;

import pl.robertburek.notification.Observer;

/**
 * Created by Robert Burek
 */
public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}
