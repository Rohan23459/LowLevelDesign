package SOLID.SRP.Follow;


public class Invoice{
    private Marker marker;
    public int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
    public int totalBill(){
        int total = 0;
        total = (this.marker.price)*this.quantity;
        return total;
    }
    public void  printInvoice(){
       System.out.println("Printing invoice");
    } 
    public void saveToDB(){
        System.err.println("Savig to DB");
    }


}
