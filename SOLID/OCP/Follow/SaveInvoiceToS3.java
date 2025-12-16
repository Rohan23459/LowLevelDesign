package SOLID.OCP.Follow;
import SOLID.SRP.Follow.Invoice;
import SOLID.SRP.Follow.Marker;

public class SaveInvoiceToS3 implements InvoiceDao {
    Marker marker;
    Invoice invoice;

    public SaveInvoiceToS3(Marker marker, Invoice invoice){
        this.marker = marker;
        this.invoice = invoice;
    }
@Override
    public void Save(){
        System.out.println("Marker Invoice details has been saved to S3");
    }

    
}
