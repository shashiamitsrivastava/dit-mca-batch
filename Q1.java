// Constructor vs Method
class A{
    int x, y;
    /*
     * Constructor name same as class name
     * Constructor call when object is created
     * Every class by default has default constructor
     * Constructor no return type , even no void
     * Constructor is used to initalize the instance Variables of a class
     */
    A(){
        System.out.println("I am the Default (No Args) Constructor");
    }
    A(int x,int y){
        this.x = x;
        this.y = y;
    }
    // Method must be call
    void A(){
        System.out.println("I am the Method");
    }
    // Logic
    void show(){
        System.out.println("X "+x+" Y "+y);
    }
}
public class Q1 {

    public static void main(String[] args) {
            A obj  = new A(100,200);  // Param Cons call
            //obj.A();
            obj.show(); // method call
    }
}
