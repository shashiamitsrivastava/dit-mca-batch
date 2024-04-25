// final vs static 
/*
 * final - fixed (Can't be change)
 * static - load with class, load only once (Once create memory)
 */
public class Q3 {
    static final int A = 200;
    // x instance variable
    final int x = 100;  // x value fixed
    // static - class bind 
    static int y;  // y value can be change , y loaded during class load
    public static void main(String[] args) {
        System.out.println(Q3.A);
       // Q3.A++;
        // final can be use locally
        final int Z = 1000; 
        // static can't be used locally it can be use only with class members
        //static int t ; // ERROR
        Q3.y++;
        Q3.y++;
        System.out.println(Q3.y);
        Q3.y++;
        Q3 q3 = new Q3();
        System.out.println(q3.x);
       // q3.x++;

    }
}
