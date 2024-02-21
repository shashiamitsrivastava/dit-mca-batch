public class ArmStrong {
    public static void main(String[] args) {
        int num = 100;
        int cpy = num;
        int count = 0;
        int sum = 0;
        // Count Digit
        while(cpy!=0){
            cpy = cpy/ 10;
            count++;
        }
        cpy = num;
        while(cpy!=0){
            int digit = cpy % 10;
            sum = sum + (int)Math.pow(digit, count);
            cpy = cpy / 10;
        }
        System.out.println(num == sum ?"ArmStrong Number":"Not an ArmStrong Number");
    }
}
