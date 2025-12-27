package SOLID.DIP.Follow;

import SOLID.DIP.Utility.BluetoothMouse;
import SOLID.DIP.Utility.WiredKeyBoard;

public class DIPFollow {
     public static void main(String[] args) {
        WiredKeyBoard wiredKeyBoard = new WiredKeyBoard("Wired", "petronics", "711", 200);
        BluetoothMouse bluetoothMouse = new BluetoothMouse("Bluetooth", "noise", "1001", 500);

        MacBook macBook = new MacBook(wiredKeyBoard, bluetoothMouse);

        macBook.getMouse();
        macBook.getKeyBoard();
    }
}
