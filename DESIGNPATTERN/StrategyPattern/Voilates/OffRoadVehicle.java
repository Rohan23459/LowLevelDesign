package DESIGNPATTERN.StrategyPattern.Voilates;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle(int numOfWheels){
        super(numOfWheels);
    }
   //unnecessary overring the parrent class function instead you can make interface for driving cabilities

    @Override
    public void drive(){
        //Special capabilites of driving
        System.out.println("vehicle having special capabilites of driving..");
    }
    
}
