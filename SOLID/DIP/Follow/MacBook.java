package SOLID.DIP.Follow;

import SOLID.DIP.Utility.KeyBoard;
import SOLID.DIP.Utility.Mouse;

public class MacBook {
   private final KeyBoard KeyBoard;
   private final Mouse Mouse;

    // It depends on Interface
    // a class should depend on interface not on any concrete class
     // Dependency injection through constructor
     // Works with any kind of keyboard and mouse
    public MacBook (KeyBoard keyBoard , Mouse mouse){
        this.KeyBoard = keyBoard; //loosly coupled
        this.Mouse = mouse;  //loosly coupled
    }

   public Mouse getMouse(){
       Mouse.getSpecification();
    return Mouse;
   }

   public KeyBoard getKeyBoard(){
    KeyBoard.getSpecification();
    return KeyBoard;
   }


}
