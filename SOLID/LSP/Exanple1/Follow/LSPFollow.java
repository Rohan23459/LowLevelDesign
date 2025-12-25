package SOLID.LSP.Exanple1.Follow;

public class LSPFollow {
    public static void main(String[] args) {

        MoterCycle moterCycle = new MoterCycle("HERO", 2, 10);
        ByCycle bycycle = new ByCycle("RANGE",2,5);
         moterCycle.accelerate();
        moterCycle.applyBreak();
        moterCycle.getNumOfWheel();
        moterCycle.turnOFFEngine();
        moterCycle.turnONEngine();

        bycycle.accelerate();
        bycycle.applyBreak();
        bycycle.getNumOfWheel();
    }
    
}
