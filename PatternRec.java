class PatternRec{
    static void printLine(int numberOfLines){
        // Base Case
        if(numberOfLines == 0){
            return ;
        }
        printStar(numberOfLines);
        System.out.println(); // New Line
        printLine(numberOfLines-1);
        // Stack Fall
        
       
    }
    static void printStar(int numberOfStars){
        // Base Case
        if(numberOfStars==0){
            return ;
        }
        System.out.print("*");
        printStar(numberOfStars-1);
    }
    public static void main(String[] args) {
        printLine(5);
    }
}