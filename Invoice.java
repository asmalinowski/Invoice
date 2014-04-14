public class Invoice {
       
        static String number;
        static String description;
        static int quantity;
        static double price;
        static double invoiceAmount;
        
        public String getNumber() {
            return number;
        }
        
        public static void setNumber(String num) {
        number = num;
        }
        
        public String getDescription () {
                return description;
        }
        
        public static void setDescription(String des){
            description = des;
        }
     
        public int getQuantity () {
            return quantity;
        }
         
        public static void setQuantity(int qty){
            quantity = qty;
        }
        
        public Double getPrice () {
            return price;
        }
       
        public static void setPrice(double pri){
            price = pri;
        }
        
        public void quantityMin (int quantity) {
       if (quantity<0)
           quantity=0;
        }
        public void priceMin (double price) {
       if (price<0)
           price=0.0; 
        }
       
        public double getInvoiceAmount (int quantity, double price) {
       invoiceAmount = quantity * price;
       return invoiceAmount;
        }
        
        public void setInvoiceAmount (double invoiceamt){
            invoiceAmount = invoiceamt;
        }
        
        public static void printInvoice() {
        System.out.println("Item number:"+ number );
        System.out.println("Item description:" + description );
        System.out.println("Item quantity:" + quantity );
        System.out.println("Item price:" + price);
        System.out.println("Invoice price:" + invoiceAmount);
        }
    }
