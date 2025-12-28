package DESIGNPATTERN.StrategyPattern.Example2.Solution;

public class BitcoinMode implements PaymentModeInterface {
    @Override
    public void pay(double amount){
        System.out.println("payment of "+amount + "done by bitcoin");
    }
}
