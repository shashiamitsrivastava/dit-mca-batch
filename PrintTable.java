public class PrintTable {
    static String printTable2(int num , int val){
        if(val==0){
            return "";
        }
        String str = printTable2(num, val-1);
        String exp =  num + "*"+val+"="+(num*val);
        str = str + exp + "\n";
        return str;
    }
    static void printTable(int num, int val){
        if(val ==0){
            return ;
        }
        // if(val >10){
        //     return ; 
        // }
        // System.out.println(num + " * "+val+" = "+(num*val));
       // printTable(num, val + 1);
       printTable(num, val - 1);
       System.out.println(num + " * "+val+" = "+(num*val));
    }
    public static void main(String[] args) {
        System.out.println(printTable2(5, 10));
        //printTable(5, 1);
        //printTable(5, 10);
    }
}
