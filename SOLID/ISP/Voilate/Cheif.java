package SOLID.ISP.Voilate;

public class Cheif implements Employee{
  

     @Override
    public void serveFood() {
    throw new AssertionError("Detail Message: Chief cannot serve food!");
    }

    @Override
    public void washDishes() {
        throw new AssertionError("Detail Message: Chief cannot clean the kitchen!");
    }

    @Override
    public void cookFood() {
        System.out.println("Clook Foods...");
    }

    @Override
    public void decideMenu() {
        System.out.println("Decide Menu...");
    }

    @Override

    public void cleanTable(){
          throw new AssertionError("Detail Message: Chief cannot clean the tble!");
    }
    
}
