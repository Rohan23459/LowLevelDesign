package SOLID.LSP.Exanple1.Voilate;

public class Bycycle implements Bike {
     String Company;
    boolean IsEngineOn;
    int Speed;
    int NumOfWheel;

    public Bycycle(String company , int speed, int numOfWheel){
        this.Company = company;
        this.Speed = speed;
        this.NumOfWheel = numOfWheel;
    }
  @Override
    public void turnOffEngine(){
        throw new AssertionError("Detail Message: Bicycle has no engine!");
    }
@Override
    public void turnOnEngine(){
        throw new AssertionError("Detail Message: Bicycle has no engine!");
    }
@Override
    public int getNumOfWheel(){
        System.out.printf("number of wheel are: %d%n", this.NumOfWheel);
    return this.NumOfWheel;
    }
@Override
    public void accelerate(){
        this.Speed = this.Speed +10;
        System.out.println("Bicycle hase accelerated");
    }

@Override
    public void applyBreak(){
        this.Speed = this.Speed - 10;
        System.out.println("break has been applied");
    }

}
