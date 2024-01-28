public class DataTypes {
     static public void main(String []a) {
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
