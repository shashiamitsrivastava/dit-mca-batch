public class DiagonalSquare {
    public static void main(String[] args) {
        int range= 11;
        // row - lines
        // col - star / space
        for(int row = 1; row<=range; row++){
            for(int col = 1; col<=range; col++){
                if(row == 1 || row == range || col ==1 || col == range || row==col || col == range-row+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
