package DESIGNPATTERN.ObserverPattern.NotifyMe.Observable;
import DESIGNPATTERN.ObserverPattern.NotifyMe.Observer.StockNotificationObserver;
import java.util.ArrayList;
import java.util.List;

public class IphoneStockAvaibilityObservable implements StockAvailabilityObservable {

    private final String productID;
    private final String productName;
    private final double price;
    private  List<StockNotificationObserver>stocksObservers;
    private  int stocksQuantity;


    public IphoneStockAvaibilityObservable(String productId, String productName , double price , int stocksQuantity){
        this.productID = productId;
        this.productName = productName;
        this.price = price;
        this.stocksObservers = new ArrayList<>();
        this.stocksQuantity = stocksQuantity;
    }

    @Override
        public void add(StockNotificationObserver observer){
            stocksObservers.add(observer);
            System.out.println("[+]" + observer.getUserID() + " subscribed for notifications on " + productName);
            
        }
    
    @Override
        public void delete(StockNotificationObserver observer){
            stocksObservers.remove(observer);
            System.out.println("[-]" + observer.getUserID() + "unsbscribe for notification on " + productName);

        }
    
    @Override
        public void notifyStocksObserver(){
            if(stocksQuantity >0 && !stocksObservers.isEmpty()){
                System.out.println("Notifying " +stocksObservers.size() + "that" + productID + "is in stocks..." );
                for (StockNotificationObserver observer: stocksObservers){
                    observer.update();

                }

            }
            
        }
    @Override
        public void addItemStock(int quantity){
            boolean wasOutOfStock = false;
            if(stocksQuantity == 0){
                wasOutOfStock = true;
            }
            stocksQuantity += quantity;
            System.out.println(quantity + productName + "Restock");
            if(wasOutOfStock && stocksQuantity>0){
                notifyStocksObserver();
            }
             
        }

    @Override
        public boolean purchase(int quantity){
            if(stocksQuantity >= quantity){
                stocksQuantity-=quantity;
                System.out.println("PURCHASE SUCCESS: " + quantity + " units of " + productName + " | " + "Remaining stock: " + stocksQuantity);
                return true;
            }
            else{
                System.out.println("PURCHASE FAILED: " + productName + " is out of stock! | " + "Available Quantity: " + stocksQuantity);
                return false;
            }
        }

        public String getProductId(){
            return productID;
        }

        public String getProductName(){
            return productName;
        }

        public double getProductPrice(){
            return price;
        }

        public int getStocksQuantity(){
            return stocksQuantity;
        }


   

    
}
