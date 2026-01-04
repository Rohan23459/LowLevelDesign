package DESIGNPATTERN.DecorativePattern.PizzaShop;

public class FinalPizza {
    public static void main (String []args){
        // Megratha pizza
         Megratha MagrathaPizza = new Megratha();
         MagrathaPizza.cost();

         //ExtraCheese + Magratha Pizza
         System.out.println("--------- ExtraCheese + Magratha Pizza ----------------");
         ExtraCheeseDecorator extraCheeseDecorator = new ExtraCheeseDecorator(MagrathaPizza, 44.0, "ExtraCheeese");
         extraCheeseDecorator.cost();

         //ExtraCheese + Magratha Pizza + Extra veggie
         System.out.println("--------- ExtraCheese + Magratha Pizza + Extra veggie ---");
         ExtraVeggie extraVeggie = new ExtraVeggie(extraCheeseDecorator, 33.0, "Extra Veggies");


         extraVeggie.cost();


        
    }
    
}
