class FlipDigit{
    public static void main(String[] args) {
        int num = 32145;
        int pos = 0;
        int sum = 0;
        while(num!=0){
            int digit = num % 10;
            pos++;
            sum = sum + pos * (int)Math.pow(10,digit-1);
            // int pow = (int)Math.pow(10,digit-1);
            // int n = pow * pos;
            // sum = sum + n;
            num/=10;
        }
        // 12543
        System.out.println(sum);
    }
}