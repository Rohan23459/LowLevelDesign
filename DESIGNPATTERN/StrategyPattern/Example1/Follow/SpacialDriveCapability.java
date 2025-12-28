package DESIGNPATTERN.StrategyPattern.Example1.Follow;

public class SpacialDriveCapability implements DriveCapabilities{

    @Override

    public void drive(){
        System.out.println("Vehicle having Spacial Driving capability");
    }
    
}
