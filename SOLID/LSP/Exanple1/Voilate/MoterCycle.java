package SOLID.LSP.Exanple1.Voilate;

public class MoterCycle implements Bike{
    String Company;
    boolean IsEngineOn;
    int Speed;
    int NumOfWheel;

    public MoterCycle(String company , int speed, int numOfWheel){
        this.Company = company;
        this.Speed = speed;
        this.NumOfWheel = numOfWheel;
    }
  @Override
    public void turnOffEngine(){
        this.IsEngineOn = false;
        System.out.println("eingine turn ON");
    }
@Override
    public void turnOnEngine(){
        this.IsEngineOn = true;
        System.out.println("engine turn OFF");
    }
@Override
    public int getNumOfWheel(){
        System.out.printf("number of wheel are: %d%n", this.NumOfWheel);
    return this.NumOfWheel;
    }
@Override
    public void accelerate(){
        this.Speed = this.Speed +10;
        System.out.println("Bike hase accelerated");
    }

@Override
    public void applyBreak(){
        this.Speed = this.Speed - 10;
        System.out.println("break has been applied");
    }

    
}
