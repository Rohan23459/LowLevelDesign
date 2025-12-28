package DESIGNPATTERN.StrategyPattern.Example1.Follow;

public class NormalDriveCapability implements DriveCapabilities {

    @Override
    public void drive(){
        System.out.println("Vehicle having Normal capabilties of driving");
    }
    
}
