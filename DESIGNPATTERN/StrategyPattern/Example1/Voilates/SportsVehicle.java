package DESIGNPATTERN.StrategyPattern.Example1.Voilates;

public class SportsVehicle extends Vehicle{

    public SportsVehicle(int numOfWheels) {
        super(numOfWheels);
    }

   //unnecessary overring the parrent class function instead you can make interface for driving cabilities
    @Override
    public void drive(){
        //special capabilites of driving
        System.out.println("vehicle having special capabilites of driving..");
    }


    
}
