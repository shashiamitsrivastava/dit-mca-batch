public class BoardDice {
    static void boardDice(int currentValue, int end, 
    String result){
        // Base Case
        if(currentValue == end){
            System.out.print(result+" , ");
            return ;
        }
        // Negative Case
        if(currentValue>end){
            return ;
        }
        // 6 Recursive calls
        for(int dice = 1; dice<=6; dice++){
            boardDice(currentValue+dice, end, result+dice);
        }
    }
    public static void main(String[] args) {
        boardDice(0, 10, "");
    }
}
