package SOLID.SRP.Follow;

public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;

    }

    public void PrintInvoice(){
        System.out.println("printing the invoice");
    }
}
