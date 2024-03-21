public class RemoveChar {
    static String searchAndRemove(String str, char search 
    ){
        // Base Case
        if(str.length()==0){
            return "";
        }
        // Small Problem (Make String small)
        String result = searchAndRemove(str.substring(1), 
        search);
        char firstChar = str.charAt(0);
        if(firstChar == search){
            return  result;
        }
        else{
            return firstChar + result;
        }
    }
    public static void main(String[] args) {
        System.out.println(searchAndRemove("hello",'l'));
    }
}
