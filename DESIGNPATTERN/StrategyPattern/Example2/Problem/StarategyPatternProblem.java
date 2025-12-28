package DESIGNPATTERN.StrategyPattern.Example2.Problem;

public class StarategyPatternProblem {
    public static void main(String[] args) {
        Payment cashPayment = new Payment("CASH", 1000);
        Payment cardPayment = new Payment("CARD", 2000);
        Payment upiPayment = new Payment("CARD", 3000);

        cashPayment.PaymentProcessor();
        cardPayment.PaymentProcessor();
        upiPayment.PaymentProcessor();
    }
    
}
