public class Fibo {
    static int fibo(int num){
        if(num<=1){
            return num;
        }
        // num - 1
        // num-2
        // first term  
        // second term 
        int firstTerm = fibo(num-1);
        int secondTerm = fibo(num-2);
        int thirdTerm = firstTerm + secondTerm;
        return thirdTerm;
    }
    public static void main(String[] args) {
        
    }
}
