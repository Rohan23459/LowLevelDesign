package SOLID.OCP.Follow;
import SOLID.SRP.Follow.Invoice;
import SOLID.SRP.Follow.Marker;

public class SaveInvoiceToDB implements InvoiceDao {
    Invoice invoice;
    Marker marker;

    public SaveInvoiceToDB(Invoice invoice, Marker marker){
        this.marker = marker;
        this.invoice = invoice;
    }
@Override
    public void Save(){
        System.out.println("Marker Invoice details save to Database");
    }



    
}
