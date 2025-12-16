package SOLID.OCP.Follow;

import SOLID.SRP.Follow.Invoice;
import SOLID.SRP.Follow.Marker;

public class OCPFollow {
    public static void main (String []args){
        Marker marker = new Marker("Camel", "SkyBlue", 30, 2010);
        Invoice invoice = new Invoice(marker, 11);
         InvoiceDao saveInvoiceToDB = new SaveInvoiceToDB(invoice, marker);
         InvoiceDao saveInvoiceToS3 = new SaveInvoiceToS3(marker, invoice);

         saveInvoiceToDB.Save();
         saveInvoiceToS3.Save();

    }


   

    
}
