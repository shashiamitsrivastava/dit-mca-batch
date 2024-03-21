public class ReverseString {
    static String reverse(String str){
        // Base Case
        if(str.length()==0){
            return "";
        }
        // Small Problem
        String result = reverse(str.substring(1));
        char firstChar = str.charAt(0);
        return result + firstChar;
    }
    public static void main(String[] args) {
        System.out.println(reverse("amit"));
    }
}
