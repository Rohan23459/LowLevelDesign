package SOLID.SRP.Follow;
public class SrpFollow{
    public static void main(String[] args) {
        Marker marker = new Marker("pentonic", "black", 10, 2024);
        Invoice invoice = new Invoice(marker,200);

        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        BillCalculator billCalculator = new BillCalculator(marker,invoice);

        invoicePrinter.PrintInvoice();
        invoiceDao.SaveToDB();
        billCalculator.CalculateBill(marker);
    }

}