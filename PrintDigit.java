class PrintDigit{
    public static void main(String[] args) {
        int num = 12345;
        int cpy = num;
        int count = 0;
        while(cpy!=0){
        count++;
        cpy = cpy / 10;
        }
        while(num!=0){
        System.out.println(num / (int)Math.pow(10, count-1));
        num = num % (int)Math.pow(10, count-1);
        count--;
        }
    }
}