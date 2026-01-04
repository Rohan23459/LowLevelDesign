package DESIGNPATTERN.DecorativePattern.CoffeShop;

public class ExtraMilk extends ToppingsDecorator{

     private final String ToppingName;
    private final int TopppingCost;
    private final BaseCoffe BaseCoffe;

    public ExtraMilk(BaseCoffe baseCoffe,String toppingName, int toppingCost){
        this.ToppingName = toppingName;
        this.TopppingCost = toppingCost;
        this.BaseCoffe = baseCoffe;
    }

    @Override
        public int cost(){
            System.out.println(this.ToppingName + "added to baseCoffe and price is " + (this.TopppingCost + this.BaseCoffe.cost()) );
            return this.TopppingCost + this.BaseCoffe.cost();
        }
    
    
}
