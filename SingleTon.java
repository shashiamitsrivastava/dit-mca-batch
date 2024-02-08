class Validation{
    private static Validation obj; // null
    private Validation(){

    }
   static Validation  getInstance(){
        if(obj == null){
            obj = new Validation();
        }
        return obj;
    }
}
public class SingleTon {
    public static void main(String[] args) {
        Validation v1 = Validation.getInstance();
        Validation v2 = Validation.getInstance();
        Validation v3 = Validation.getInstance();
        System.out.println(v1==v2 && v1==v3);


        // Validation v1 = new Validation();
        // Validation v2 = new Validation();
        // Validation v3 = new Validation();
    }
}
