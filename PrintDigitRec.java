public class PrintDigitRec {
    static void printDigit(int num){
        // Base Case
        if(num ==0){
            return ; // exit from the current function call
        }
            // Small Problem
            printDigit(num/10);
            System.out.println(num % 10);

    }
    public static void main(String[] args) {
        printDigit(12345);
    }
}
