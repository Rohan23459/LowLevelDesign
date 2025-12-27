package SOLID.DIP.Voilates;
import SOLID.DIP.Utility.BluetoothMouse;
import SOLID.DIP.Utility.KeyBoard;
import SOLID.DIP.Utility.Mouse;
import SOLID.DIP.Utility.WiredKeyBoard;

public class MacBook {
    private final WiredKeyBoard keyBoard;
    private final BluetoothMouse mouse;
    // Direct dependency on concrete class
    // a class should depend on interface not on any concrete class
    public MacBook (WiredKeyBoard wiredKeyBoard , BluetoothMouse bluetoothMouse){
        keyBoard = wiredKeyBoard; //tightly coupled
        mouse = bluetoothMouse;  //tightly coupled
    }

   public Mouse getMouse(){
       mouse.getSpecification();
    return mouse;
   }

   public KeyBoard getKeyBoard(){
    keyBoard.getSpecification();
    return keyBoard;
   }

    
}
