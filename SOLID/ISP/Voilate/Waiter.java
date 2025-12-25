package SOLID.ISP.Voilate;

public class Waiter implements Employee{
    

     @Override
    public void serveFood() {
        System.out.println("Serving food and drinks...");
    }

    @Override
    public void washDishes() {
        // Forced to implement but doesn't make sense for a waiter
        throw new AssertionError("Detail Message: Waiter cannot clean the kitchen!");
    }

    @Override
    public void cookFood() {
        // Forced to implement but doesn't make sense for a waiter
        throw new AssertionError("Detail Message: Waiter cannot prepare food!");
    }

    @Override
    public void decideMenu() {
        // Forced to implement but doesn't make sense for a waiter
        throw new AssertionError("Detail Message: Waiter cannot decide the menu!");
    }

    @Override

    public void cleanTable(){
          System.out.println("Clean dirty tables...");
    }



}
