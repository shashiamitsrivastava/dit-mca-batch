public class ReplaceHiWithHello {
    static String replaceHiWithHello(String str){
        // Base Case
        if(str.length()<=1){
            return str;
        }
        // check first and second char is hi
        if(str.charAt(0)=='h' && str.charAt(1)=='i'){
            String result= replaceHiWithHello(str.substring(2));
            return "Hello" + result;
        }
        else{
            String result =replaceHiWithHello(str.substring(1));
            return str.charAt(0) + result;
        }
    }
    public static void main(String[] args) {
        String str = "hi amit hi tom";
        System.out.println(replaceHiWithHello(str));
    }
}
