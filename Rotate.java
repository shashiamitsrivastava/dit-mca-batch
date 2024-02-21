public class Rotate {
    public static void main(String[] args) {
        int num = 12345;
        int rotations = -1;
        int result = 0;
        int count =  0;
        int cpy = num;
        // Count the Digits
        while(cpy!=0){
            cpy = cpy / 10; // make number small
            count++;
            }
        // 45123
        // Extract RHS
        rotations = rotations % count;
        if(rotations<0){
            rotations = rotations + count;
        }
        int rhs = num % (int)Math.pow(10, rotations);
        // Extract LHS
        int lhs = num / (int)Math.pow(10, rotations);
        //System.out.println(rhs + ""+lhs);
        
        result = rhs * (int)Math.pow(10, (count-rotations)) + lhs;
        System.out.println(result);
    }
}
