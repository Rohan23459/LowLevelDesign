package SOLID.LSP.Exanple1.Voilate;

public class LspVoilate {
    public static void main(String []args){
        MoterCycle moterCycle = new MoterCycle("HERO",0, 2);
        Bycycle bycycle = new Bycycle("RANGER", 0, 2);


        moterCycle.accelerate();
        moterCycle.applyBreak();
        moterCycle.getNumOfWheel();
        moterCycle.turnOnEngine();
        moterCycle.turnOffEngine();

        bycycle.accelerate();
        bycycle.applyBreak();
        bycycle.getNumOfWheel();
        //this voilates LSP principle
        bycycle.turnOnEngine();
        bycycle.turnOffEngine();
        

    }
    
}
