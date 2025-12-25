package SOLID.LSP.Exanple1.Follow;

public class Bike {
    String Company;
    int NumOfWheel;
    int Speed;


    public Bike(String company, int numOfWheel, int speed){
        this.Company = company;
        this.NumOfWheel = numOfWheel;
        this.Speed = speed;


    }

    public void accelerate(){
        this.Speed = this.Speed +10;
         System.out.println("Bike hase accelerated");
        
    }

    public void applyBreak(){
        this.Speed = this.Speed -10;
         System.out.println("Break has been applied");

    }

    public  int getNumOfWheel(){
         System.out.printf("number of wheel are: %d%n", this.NumOfWheel);
        return this.NumOfWheel;
    }

}
