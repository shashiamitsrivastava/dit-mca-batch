/*
 * Can we override the static methods
 * static - when class load , static things will be bind with class
 * Override - IS - A, object create , Object Bind
 */
class X{
    static void show(){
        System.out.println("X Show");
    }
}
class Y extends X{
   
   static void show(){
        System.out.println("Y Show");
    }
}
public class Q5 {
    public static void main(String[] args) {
       // X.show();
        //Y.show();
        //  X x = new Y();
        //  x.show();
    }
}
