package DESIGNPATTERN.ObserverPattern.NotifyMe.Observable;

import DESIGNPATTERN.ObserverPattern.NotifyMe.Observer.StockNotificationObserver;

public interface  StockAvailabilityObservable {
    void add(StockNotificationObserver observer);
    void delete(StockNotificationObserver observer);
    void notifyStocksObserver();
    boolean purchase(int quantity);
    void addItemStock(int quantity); 
}
