public class Add {
    public static void main(){
        System.out.println("No Args Main");
    }
    public static void main(int x){
        System.out.println("int main");
    }
    public static void main(String ...args) {
        main();
        main(10);
        int sum = 0;
        for(int i = 0 ; i<args.length; i++){
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Sum is "+sum);
    }
}
// Add "10" "20" "30"
// Add 10 20 30 40 50
// Add 10
// Add 
