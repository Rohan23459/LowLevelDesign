package DESIGNPATTERN.StrategyPattern.Example2.Solution;

public class UpiMode implements PaymentModeInterface {
    @Override
    public void pay(double amount){
        System.out.println("payment of "+amount + "done by upi");
    }
    
}
