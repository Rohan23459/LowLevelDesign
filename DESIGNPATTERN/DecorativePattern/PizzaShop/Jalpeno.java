package DESIGNPATTERN.DecorativePattern.PizzaShop;

public class Jalpeno extends  TopingsDecorator {

    //has a base pizza
    private final BasePizza basePizza;
    private final double  topingCost;
    private final String toppingsName; 

    public Jalpeno(BasePizza basePizza, double topingCost, String toppingsName){
        this.basePizza = basePizza;
        this.topingCost = topingCost;
        this.toppingsName = toppingsName;
    }

    @Override
        public double cost(){
            System.out.println(this.toppingsName + " is added to pizza and cost is " + (this.topingCost+basePizza.cost()));
            return this.topingCost+basePizza.cost();
        }




    
}
