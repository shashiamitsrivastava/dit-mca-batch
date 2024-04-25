/*
 * final with Local Var (Value Type , Reference Type)
 * final with Instance Var , final with Constructor
 * final with class - prevent inheritance
 * final with method - prevent overriding
 * 
 */

 final class MathTri{
    void sin(){

    }
    void cos(){

    }
 }

 class Parent{
    int x, y;
   final void show(){
        System.out.println("Parent show...");
    }
}
class Child extends Parent{
 // x,y
 int z;
 void show(int x){
    System.out.println("Overloading...");
 }
    // @Override
    // void show(){

    // }
}
public class Q2C {
    public static void main(String[] args) {
        //System.out.println();
       final Child c = new Child();
       c.x++;
       c.y++;
       c.z++;
       //c = new Child(); // ReAssign of Reference
        c.show();
        c.show(1);
    }
}
