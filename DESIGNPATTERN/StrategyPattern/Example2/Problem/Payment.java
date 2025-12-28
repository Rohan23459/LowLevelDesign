package DESIGNPATTERN.StrategyPattern.Example2.Problem;

public class Payment {
    private String PaymentMethod;
    private double Amount;

    public Payment(String paymentMethod, double amount){
        this.PaymentMethod = paymentMethod;
        this.Amount = amount;
    }

    public void PaymentProcessor(){
        switch (PaymentMethod) {
            case "CASH" -> System.out.println("Paid $" + Amount + " using cash");
            case "UPI" -> System.out.println("Paid $" + Amount + " using UPI");
            case "CARD" -> System.out.println("Paid $" + Amount + " using credit card");
            default -> throw new IllegalStateException("Unexpected value: " +PaymentMethod );
        }
        // Adding another payment method(crypto) requires modifying this class
        // This keeps growing with each new payment method
        // bad design

    }
    
}
