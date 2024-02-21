public class StrongNumber {

    static int fact(int digit){
        // 5 * 4 * 3 * 2 * 1
        int result = 1;
        while(digit>1){
            result = result * digit;
            digit--;
        }
        return result;
    }
    public static void main(String[] args) {
        int num = 145;
        int cpy = num;
       
        int sum = 0;
        
        while(cpy!=0){
            int digit = cpy % 10;
            sum = sum + fact(digit);
            cpy = cpy / 10;
        }
        System.out.println(num == sum ?"Strong Number":"Not a Strong Number");
    }
}
