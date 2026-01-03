package DESIGNPATTERN.ObserverPattern.NotifyMe.Observer;

public interface StockNotificationObserver {

    void update();
    String getNotificationMethod();
    String getUserID();

    
}
