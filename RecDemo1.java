class RecDemo1{
    //Given :  Big Problem
    // My Name Print 5 times
    // 1. Small Problem (5 --> 4 ) (val-1)
    // 2. Processing Logic (Printing)
    // 3. Stop Condition - Base Case
    static void show(int val){
        // Base Case (Where Recursion will stop)
        if(val == 0){
            return ; 
        }
        // Processing Logic to Perform
        System.out.println("Amit "+val); // Stack Building / Pre-Processing Logic
        show(val-1); 
        System.out.println("Srivastava "+val); // Stack Fall / Post - Processing Logic
    }
    public static void main(String[] args) {
        show(5);
    }
}