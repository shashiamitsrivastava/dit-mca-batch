public class DataTypes {
    // 
    static void show(int ...z){

    }
     static public void main(String ...a) {
        show();
        show(10,20);
        show(10,20,30);
            // Primitive/ Primary / Value Type/ Immutable Type
            int e = 100;
            System.out.println(e+1);
            System.out.println(e);
            //int r = e;
            //r++;
           // System.out.println(r);
            //System.out.println(e);
            // Mutable Type
            String name = "Amit";
            String name2 = name;
            String name3 = new String("Amit");
            System.out.println(name == name2);
            System.out.println(name == name3);

    }
}
