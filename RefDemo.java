public class RefDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        synchronized(sb){
        sb.append("amit");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        }
        sb.append("gfjdjlggjlfljkjgdfllkgdfjklgjdfklgjfdjglkdfjlkgjgj");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        // sb.append("select * from users")
        // .append(" where userid = 'amit");
        //String sql = "select * from users";
        // sql = sql + "where userid = 'amit'";
        // sql = sql +" and password = ''";

        String name = "Amit".intern(); // 1
        String name2 = "Amit".intern(); //0 
        String name3 = new String("Ram");
         System.out.println(name2.toUpperCase());
         System.out.println(name + " "+name2);
        // String name2 = name;
        System.out.println(name == name2); // Ref Compare
        System.out.println(name.equals(name2));


    }
}
