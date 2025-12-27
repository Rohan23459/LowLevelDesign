package DESIGNPATTERN.StrategyPattern.Voilates;

public class Vehicle {
    private int NumOfWheels;
    
    public Vehicle(int numOfWheels){
        this.NumOfWheels = numOfWheels;
    }


    public void drive(){
        //normal capabilities
        System.out.println("normal capablities of driving");
    }

    public int getNumOfWheels(){
        System.out.println("number of wheels are:" + NumOfWheels);
        return NumOfWheels;

    }
    
}
