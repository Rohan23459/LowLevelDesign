package DESIGNPATTERN.DecorativePattern.CoffeShop;

public class FinalCoffe {

    public static void main(String[] args) {
        //Base coffe
        
        Americano americano = new Americano();
        System.out.println( " Base coffe cost is:  " +americano.cost() );
        

        //BaseCoffe + Extra milk
      System.out.println( "-----------BaseCoffe + Extra milk-----------" );
        ExtraMilk extraMilk = new ExtraMilk(americano, "Extra Milk", 39);

        extraMilk.cost();

        //BaseCoffe + Extra milk + cream add on 
      System.out.println( "-----------BaseCoffe + Extra milk + cream add on-----------" );
      
        Cream cream = new Cream(extraMilk, "Cream", 45);
        cream.cost();

        
        

    }
    
}
