package SOLID.SRP.Follow;

public class InvoiceDao {
    private Invoice invoice;
    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void SaveToDB(){
        System.out.println("Saving invice to Database");
    }
}
