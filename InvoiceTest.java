public class InvoiceTest {
     public static void main(String[] args) {
  
      Invoice.setNumber("G565");
      Invoice.setDescription("Bolt");
      Invoice.setQuantity(5);
      Invoice.setPrice(.75);
      Invoice.printInvoice();

     }
}
