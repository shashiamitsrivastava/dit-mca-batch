public class SwapFirstAndLast {
   public static void main(String[] args) {
    int num = 7245;
    int count = 0;
    // get the last digit
    int lastDigit = num % 10;
    // get the first digit
    // a) Count the digit
    int cpy = num;
    while(cpy!=0){
        cpy = cpy/ 10;
        count++;
    }
    int power = (int)Math.pow(10, count-1);
    int firstDigit = num / power;
    num = num/10; 
    int middleDigits = num % (int)Math.pow(10, count -2);
    int result= lastDigit * power + middleDigits * 10 + firstDigit;
    System.out.println(result);
   } 
}
