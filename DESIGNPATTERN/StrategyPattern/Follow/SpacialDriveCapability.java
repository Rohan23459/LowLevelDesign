package DESIGNPATTERN.StrategyPattern.Follow;

public class SpacialDriveCapability implements DriveCapabilities{

    @Override

    public void drive(){
        System.out.println("Vehicle having Spacial Driving capability");
    }
    
}
