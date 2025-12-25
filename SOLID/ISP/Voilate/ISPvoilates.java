package SOLID.ISP.Voilate;

public class ISPvoilates {
    public static void main(String[] args) {
        Cheif chief = new Cheif();
        Waiter waiter = new Waiter();
        chief.cookFood();
        chief.decideMenu();
        waiter.cleanTable();
        waiter.serveFood();

        chief.serveFood();

        chief.cleanTable();
        
        
        chief.washDishes();
        
        waiter.cookFood();
        waiter.decideMenu();
        
        
        waiter.washDishes();

        
    }
    
}
