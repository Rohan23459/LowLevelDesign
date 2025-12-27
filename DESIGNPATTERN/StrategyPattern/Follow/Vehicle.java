package DESIGNPATTERN.StrategyPattern.Follow;

public class Vehicle {
    private  int NumOfWheels;
    private DriveCapabilities DriveCapabilities;

    public  Vehicle(int numOfWheels, DriveCapabilities driveCapabilities){
        this.NumOfWheels = numOfWheels;
        this.DriveCapabilities = driveCapabilities;
    }

    public int getNumOfWheels(){
        System.out.println("numOfWheels are:"+ NumOfWheels);
        return NumOfWheels;
    }

    public void drive() {
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        DriveCapabilities.drive();
    }

}
