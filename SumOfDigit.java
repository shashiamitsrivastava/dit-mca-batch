public class SumOfDigit {
    static int sumOfDigit(int num){
        // Base Case
        if(num ==0){
            return 0;
        }
        // Small Problem + Cycle
        int sum = sumOfDigit(num/10);
        sum = sum + num % 10;
        return sum;
    }

    static void sumOfDigit(int num, int sum){
        //Base Case / Termination Case
        if(num ==0){
            System.out.println("Sum "+sum);
            return ; // exit from the function
        }
        sum = sum + num % 10;
        // Small Problem + Cycle
        sumOfDigit( num/10, sum);
    }
    public static void main(String[] args) {
       // sumOfDigit(123, 0);
       System.out.println(sumOfDigit(123));
    }
}
