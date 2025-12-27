package DESIGNPATTERN.StrategyPattern.Voilates;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle(int numOfWheels){
        super(numOfWheels);
    }

    //here no need to overiding the drive function it can use normal capabilities of drive as having parrent vehicle class

    
}
