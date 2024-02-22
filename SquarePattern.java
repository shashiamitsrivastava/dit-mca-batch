public class SquarePattern {
    public static void main(String[] args) {
        int range = 5;
        for(int row = 1; row<=range; row++){
            for(int col = 1; col<=range; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
