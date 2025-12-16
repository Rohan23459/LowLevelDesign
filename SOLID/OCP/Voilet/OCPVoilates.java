package SOLID.OCP.Voilet;
import SOLID.SRP.Follow.Invoice;
import SOLID.SRP.Follow.Marker;
public class OCPVoilates {
    public static void main(String[] args) {
        Marker marker = new Marker("pantonic", "blue", 15, 2020);

        Invoice invoice = new Invoice(marker, 12);

        InvoiceDao invoiceDao = new InvoiceDao(marker, invoice);

        invoiceDao.SaveToDatabase();
        invoiceDao.SaveToS3();

        
    }
    
}
