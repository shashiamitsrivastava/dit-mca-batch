// Final Use Cases
/*
 * final (fixed) - keyword 
 */
class Base{
    // final int y = 10; // Instance Variable
    final int y;
    Base(){
        y = 100;
    }
    Base(int y){
        //this();
       this.y = y;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Base base = new Base(10);
        //base.y++;
    //     // final use Local Variable
    //     final int a = 10; // Constant
    //     System.out.println(a);
    //    // a++;
    //     final StringBuffer sb = new StringBuffer();
    //     sb.append("Hello");
    //     System.out.println(sb);
    //     sb.append("hi");
    //     System.out.println(sb);
       // sb = new StringBuffer();
        

    }
}
