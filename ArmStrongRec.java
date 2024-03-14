public class ArmStrongRec {
    // 153 (3 Digit)
    static int countDigit(int num){
        // One time Code (Base case)
        if(num==0){
            return 0 ; // count value 0
        }

        // Function call (Recursion)
        int count = countDigit(num/10); // Small Problem
        // Stack Fall
        return count + 1;
        // N time Code
    }

    // 153
    static void armStrongNumber(int num, int sum, int cpy, int digitCount){
        // Base Case
        if(num ==0){
            if(sum == cpy){
                System.out.println("ArmStrong Number");
            }
            else{
                System.out.println("Not ArmStrong Number");
            }
            return ; // exit from the current function call
        }
        // Logic
        int digit  = num % 10;
       //int cube =  digit * digit * digit;
       int power = (int)Math.pow(digit, digitCount);
       sum = sum + power;
       // Stack Build 
        // Small Problem + Recursion
        armStrongNumber(num/10, sum, cpy, digitCount);
    }
    public static void main(String[] args) {
        int num = 100;
        int digitCount  = countDigit(num);
        armStrongNumber(num, 0, num, digitCount);
    }
}
