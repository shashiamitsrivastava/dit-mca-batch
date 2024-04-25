// == vs equals vs equalsIgnoreCase vs compareTo vs compareToIgnoreCase
public class Q6 {
    public static void main(String[] args) {
        int x = 100;
        int y = 100;
        String a = "Amit";
        String b = new String("AMIT");
        System.out.println(x == y); // 100 == 100 (true)
        System.out.println(a == b); // == Reference Compare (false)
        System.out.println(a.equals(b)); // true/ false
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.compareTo(b)); // -vs pos 0
        System.out.println(a.compareToIgnoreCase(b));
    }
}
