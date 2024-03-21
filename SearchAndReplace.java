public class SearchAndReplace {
    static String searchAndReplace(String str, char search, 
    char replace){
        // Base Case
        if(str.length()==0){
            return "";
        }
        // Small Problem (Make String small)
        String result = searchAndReplace(str.substring(1), 
        search, replace);
        char firstChar = str.charAt(0);
        if(firstChar == search){
            return replace + result;
        }
        else{
            return firstChar + result;
        }
    }
    public static void main(String[] args) {
        System.out.println(searchAndReplace("Hello", 
        'l', 'x'));
    }
}
