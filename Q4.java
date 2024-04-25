// Method Binding vs Variable Binding
class P{
    int x= 10;
    void show(){
        System.out.println("P Show...");
    }
}
class C extends P{
    int x = 20;
    @Override
    void show(){
        System.out.println("C Show "+this.x + " " +super.x); // this - C Object
    }
    void disp(){
        System.out.println("C Disp");
    }
}
public class Q4 {
    public static void main(String[] args) {
        // P p ; // p variable P type/class
        // new C(); Object create
        P p = new C(); // Upcasting
        p.show(); // method bind object
        System.out.println(p.x); // variable type bind
        //p.disp();
    }
}
