// In Java - We can;t create a class with out inheritance
// Object class - GOD Class
interface IOrder{
    void book();
    void cancel();
    void status();
}
class Customer extends Object{
//class Customer{
    // Instance Variables (Memory - Instance Create)
    // Instance Create - Object Create
    int id;
    String name;
    double balance;
    // Customer has a Order (association)
   // Order order = new Order();
   IOrder order ; 
   Customer(){
    order =new Order(); // Composition
    System.out.println("Customer Born");
    // Constructor call when object is constructed
   }
   void details(){
    order.book();
    order.cancel();
    order.status();
    //order.duration();
    //order.payment();
    // order.cancel();
    // order.status();
    //order.assignOrderToWareHouse();
    //order.purchasePrice();
   }
   Customer(Order order ){
        this.order = order;
        System.out.println("Customer Born.......");
   }
   @Override
   protected void finalize(){
        System.out.println("Customer Good Bye...");
   }


}
class Order implements IOrder{
    int id;
    String name;
    int qty;
    double price;
    @Override
    public void book(){
        System.out.println("Order Book");
        payment(2000);
        duration();
        delDetails();
    }
    public void payment(int amount){
        System.out.println("Payment...");
    }
    public void duration(){
        System.out.println("Duration...");
    }
    public void delDetails(){
        System.out.println("Del Details...");
    }
    @Override
    public void cancel(){
        System.out.println("Order Cancel");
    }
    @Override
    public void status(){
        System.out.println("Order Status");
    }
    public void assignOrderToWareHouse(String city){   
        System.out.println("Order Assign to WareHouse");
    }
    public void purchasePrice(){
        System.out.println("Product Purchase Price");
    }
    Order(){
        System.out.println("order born");
    }
    @Override
    protected void finalize(){
         System.out.println("Order Good Bye...");
    }
}
class HasADemo{
    public static void main(String[] args) {
        // Customer Object create
        Order order =new Order();
        Customer ram = new Customer(order);
        ram.details();
        // ram = null;
        // // Customer ram = new Customer(); // Has A
        // // ram = null; // Eligable GC
        // for(int i = 1; i<=10; i++){
        //     // output
        //     System.out.println("I "+i);
        // }
    }
}