package SOLID.SRP.Follow;

public class BillCalculator {
    private Marker marker;
    private Invoice invoice;

    public BillCalculator( Marker marker, Invoice invoice){
        this.marker = marker;
        this.invoice = invoice;
    }
    public void CalculateBill(Marker marker){
       int totalBill = invoice.quantity * marker.price;
        System.out.printf("total bill : %d", totalBill);
    }
}
