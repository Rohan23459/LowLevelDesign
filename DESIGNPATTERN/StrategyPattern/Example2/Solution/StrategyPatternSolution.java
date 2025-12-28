package DESIGNPATTERN.StrategyPattern.Example2.Solution;

public class StrategyPatternSolution{
    public static void main(String[] args) {

        CashMode cashMode = new CashMode();
        UpiMode upiMode = new UpiMode();
        BitcoinMode bitcoinMode = new BitcoinMode();
        

        Payment cashPayment = new Payment (cashMode);
        Payment upiPayment = new Payment(upiMode);
        Payment bitcoinPayment = new Payment(bitcoinMode);


        cashPayment.checkout(500);
        upiPayment.checkout(700);
        bitcoinPayment.checkout(1000);
        
    }

}