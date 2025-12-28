package DESIGNPATTERN.StrategyPattern.Example2.Solution;

public class Payment {
    private PaymentModeInterface PaymentModeInterface;

    public Payment( PaymentModeInterface paymentModeInterface){
        this.PaymentModeInterface = paymentModeInterface;
    }

    public void checkout(double amount) {
        System.out.print(PaymentModeInterface.getClass().getSimpleName() + ": ");
        PaymentModeInterface.pay(amount);
    }

    
}
