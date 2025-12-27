package SOLID.DIP.Utility;

public class BluetoothKeyboard implements KeyBoard{

      private final String ConnectionType;
    private final String Company;
    private final String ModelVersion;
    private final int Price;

    public BluetoothKeyboard(String connectionType , String company, String modelVersion, int price){
        this.ConnectionType = connectionType;
        this.Company = company;
        this.ModelVersion = modelVersion;
        this.Price = price;
    }

    @Override
    public void getSpecification(){
        System.out.println("====> Bluetooth KeyBoard");
        System.out.println("Connection type:"+ ConnectionType);
        System.out.println("Company name:" + Company);
        System.out.println("Model version is :" + ModelVersion);
        System.out.println("Price is :" + Price);
    }
    
    
}
