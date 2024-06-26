public class MazePathProblem {

    static void mazePath(int row, int col , int endRow, 
    int endCol, String result){
        // Base Case
        if(row == endRow && col==endCol){
            System.out.println(result);
            return ;
        }
        if(row>endRow || col>endCol){
            return ;
        }
        // Small Problem (Move one step H or V)
        mazePath(row, col+1, endRow, endCol, result+"H");
        mazePath(row+1, col, endRow, endCol, result+"V");
    }
    public static void main(String[] args) {
        mazePath(0, 0, 2, 2, "");
    }
}
