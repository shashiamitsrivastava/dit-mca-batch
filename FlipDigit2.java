class FlipDigit2{
    public static void main(String[] args) {
        int num = 32145;
        int position = 0;
        int sum = 0;
        while(num!=0){
        // number extract digit
        // count digit (Position)
        int lastDigit = num % 10; // 5 Digit --> 5 Position
        position++; // 1 Position --> 1 Digit
       int pow =  (int)Math.pow(10, lastDigit-1);
       sum = sum + position * pow;
       num = num / 10;
        }
        System.out.println(sum);

    }
}