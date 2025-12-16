package SOLID.OCP.Voilet;

import SOLID.SRP.Follow.Invoice;
import SOLID.SRP.Follow.Marker;;

public class InvoiceDao {
    
    private Marker marker;
    private Invoice invoice;

    public  InvoiceDao(Marker marker, Invoice invoice){
        this.invoice = invoice;
        this.marker = marker;
    }

    public void SaveToDatabase(){
        System.out.printf("All marker invoice detals save to database");
    }

    public void SaveToS3(){
        System.out.printf("All marker invoice details save to S3");
    }
}
