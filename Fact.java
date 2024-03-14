public class Fact {
    static int fact(int num){
        if(num == 1){
            return num;
        }
        return num * fact(num-1);
        //int result = fact(num-1); // Small Problem + Cycle (Recursion)
        //return result * num;
    }
    // 5 - 5 * 4 * 3 * 2 * 1 = 120
    static void fact(int num, int result){
        // Base Case
        if(num == 1){
            System.out.println("Fact "+result);
            return ;
        }
        // Small Problem
        fact(num-1, num * result);
    }
    public static void main(String[] args) {
       // fact(5,1);
       System.out.println(fact(5));
    }
}
