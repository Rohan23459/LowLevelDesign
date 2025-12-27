package DESIGNPATTERN.StrategyPattern.Follow;

public class StrategyPatternFollow {
    public static void main (String []args){

        NormalDriveCapability normalDriveCapability = new NormalDriveCapability();
        SpacialDriveCapability specialDriveCapability = new SpacialDriveCapability();
        PassengerVehicle passengerVehicle = new PassengerVehicle(12, normalDriveCapability);
        SportsVehicle sportsVehicle = new SportsVehicle(4,specialDriveCapability );
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle(4, specialDriveCapability);

        passengerVehicle.getNumOfWheels();
        passengerVehicle.drive();
        sportsVehicle.getNumOfWheels();
        sportsVehicle.drive();
        offRoadVehicle.getNumOfWheels();
        offRoadVehicle.drive();
        

    }
    
}
