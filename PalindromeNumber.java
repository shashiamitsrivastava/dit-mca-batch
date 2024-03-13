public class PalindromeNumber {

    static void checkPalindrome(int num, int reverse, int cpy){
        // Base Case
        if(num ==0){
            if(reverse == cpy){
                System.out.println("Palindrome Number");
            }
            else{
                System.out.println("Not a Palindrome Number");
            }
            return ;
        }
        // Small Problem
        reverse = reverse * 10 + num % 10;
        checkPalindrome(num/10, reverse, cpy);
    }
    public static void main(String[] args) {
        checkPalindrome(123, 0, 151);
    }
}
