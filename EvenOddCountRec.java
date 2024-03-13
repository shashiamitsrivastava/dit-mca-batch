public class EvenOddCountRec {
    // Big Problem
    // Small Problem
    // n-1
    static int[] countEvenOdd(int range){
        if(range==0){
            int arr[] = new int[2]; // Array Create only one time (Base Case)
            // arr[0] = 0 arr[1]=0
            return arr; 
        }
        // Head Recursion
        int arr[] = countEvenOdd(range-1); // Small Problem + Cycle
        // Post Processing Logic (Stack Fall)
        if(range % 2 == 0){
            arr[1] = arr[1] + 1; // Even Store
        }
        else{
            arr[0]  = arr[0] + 1;// Odd Store
        }
        return arr;
    }

    static void countEvenOdd(int range, int even , int odd){
        // int even = 0;
        // int odd = 0;
        // Base Case
        if(range == 0){
            System.out.println("Even Count "+even + " Odd Count "+odd);
            return ;
        }
        if(range % 2==0){
            even++;
        }
        else{
            odd++;
        }
        countEvenOdd( range-1, even, odd); // Small Problem + Cycle (Call)
    }
    public static void main(String[] args) {
        //int range = 10;
        //countEvenOdd(range, 0, 0);
        int arr[] = countEvenOdd(10);
        System.out.println("Odd "+arr[0]);
        System.out.println("Even "+arr[1]);

    }
}
