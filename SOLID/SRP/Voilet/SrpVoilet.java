
public class SrpVoilet{
    public static void main(String[]args){
        Marker marker = new Marker("pantonic","Blue",12,2024);
        Invoice invoice = new Invoice(marker,5);

        int totalBill = invoice.totalBill();
        System.out.printf("total price of %d marker:%d %n",invoice.quantity,totalBill);

        invoice.printInvoice();
        invoice.saveToDB();

        
     }
}
