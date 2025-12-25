package SOLID.LSP.Exanple1.Follow;

public class ByCycle  extends Bike{
    public ByCycle(String company, int numOfWheel, int speed) {
        // this keyWord super is used for sending these values to the public Bike(...) constructor you wrote in the parent class.
        super(company, numOfWheel, speed);
    }
}
