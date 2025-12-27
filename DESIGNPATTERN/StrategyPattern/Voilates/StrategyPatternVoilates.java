package DESIGNPATTERN.StrategyPattern.Voilates;

public class StrategyPatternVoilates {
    public static void main (String []args){
        PassengerVehicle passengerVehicle = new PassengerVehicle(8);
        SportsVehicle sportsVehicle = new SportsVehicle(4);
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle(4);

        passengerVehicle.drive();
        sportsVehicle.drive();
        offRoadVehicle.drive();

          passengerVehicle.getNumOfWheels();
        sportsVehicle.getNumOfWheels();
        offRoadVehicle.getNumOfWheels();

    }
    
}
