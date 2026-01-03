package DESIGNPATTERN.ObserverPattern.NotifyMe;

import DESIGNPATTERN.ObserverPattern.NotifyMe.Observable.IphoneStockAvaibilityObservable;
import DESIGNPATTERN.ObserverPattern.NotifyMe.Observer.EmailNotificationObserver;
import DESIGNPATTERN.ObserverPattern.NotifyMe.Observer.MessegeNotificationObserver;
import DESIGNPATTERN.ObserverPattern.NotifyMe.Observer.StockNotificationObserver;

public class EcommerceStockNotifyApp {
    public static void main(String[] args) {
        
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("###### E-commerce Store - Stock Availability Notification Feature Demo ######");


        //Iphone product observable with iphone stocks = 10
        IphoneStockAvaibilityObservable iphoneStocksObssObservable = new IphoneStockAvaibilityObservable("1234", "Iphone16", 60000.0, 10);
        
         // Create observers
        StockNotificationObserver John_Mob_no = new MessegeNotificationObserver("John123", "8540083723");
        StockNotificationObserver Katy_Mob_no = new MessegeNotificationObserver("Katy678", "9546567234");
        StockNotificationObserver Jane_EMAIL = new EmailNotificationObserver("Jane783", "jane783@gmail.com");
        StockNotificationObserver George_EMAIL = new EmailNotificationObserver("George993", "george993@gmail.com");

        // Black Friday Sale - Purchase all 10 units
        iphoneStocksObssObservable.purchase(10);

        // Stock unavailability leads to users subscribing for notifications
        boolean success = iphoneStocksObssObservable.purchase(1); // Failed purchase
        if (!success) {
            // Register observers - John, Katy, Jane, George subscribe to notifications upon stock availability
            iphoneStocksObssObservable.add(John_Mob_no); // John
            iphoneStocksObssObservable.add(Katy_Mob_no); // Katy
            iphoneStocksObssObservable.add(Jane_EMAIL); // Jane
            iphoneStocksObssObservable.add(George_EMAIL); // George
        }

        //20 iphone added to stocks
        iphoneStocksObssObservable.addItemStock(20);

        iphoneStocksObssObservable.purchase(1);//john buy 1 iphone
        iphoneStocksObssObservable.delete(John_Mob_no);
        iphoneStocksObssObservable.purchase(1);//Katty buy 1 iphone
        iphoneStocksObssObservable.delete(Katy_Mob_no);


        //new year sale started

        iphoneStocksObssObservable.purchase(18);

        //10 iphone added to stocks and this time
        iphoneStocksObssObservable.addItemStock(10);// now notification is only sent to jane and george


        iphoneStocksObssObservable.purchase(1);//jane buy 1 iphone
        iphoneStocksObssObservable.delete(Jane_EMAIL);
        iphoneStocksObssObservable.purchase(1);//George buy 1 iphone
        iphoneStocksObssObservable.delete(George_EMAIL);


    }
    
}
