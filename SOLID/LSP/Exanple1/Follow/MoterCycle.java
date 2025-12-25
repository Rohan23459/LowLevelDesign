package SOLID.LSP.Exanple1.Follow;

public class MoterCycle extends Bike implements Engine{
    boolean IsEngineOn;

public MoterCycle(String company, int numOfWheel, int speed) {
        super(company, numOfWheel, speed);
    }
    @Override
    public boolean turnONEngine(){
        this.IsEngineOn = true;
        System.out.println("engine turn ON");
        return this.IsEngineOn;
    }
    @Override
    public boolean turnOFFEngine(){
        this.IsEngineOn = false;
        System.out.println("engine turn OFF");

        return this.IsEngineOn;
        
    }
    
}
