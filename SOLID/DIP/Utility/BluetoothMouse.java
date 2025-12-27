package SOLID.DIP.Utility;

public class BluetoothMouse implements Mouse{

     private final String ConnectionType;
    private final String Company;
    private final String ModelVersion;
    private final int Price;

    public BluetoothMouse(String connectionType , String company, String modelVersion, int price){
        this.ConnectionType = connectionType;
        this.Company = company;
        this.ModelVersion = modelVersion;
        this.Price = price;
    }

    @Override
    public void getSpecification(){
        System.out.println("====> Bluetooth Mouse");
        System.out.println("Connection type:"+ ConnectionType);
        System.out.println("Company name:" + Company);
        System.out.println("Model version is :" + ModelVersion);
        System.out.println("Price is :" + Price);
    }
    
}
