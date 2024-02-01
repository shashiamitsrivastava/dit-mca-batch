public class Input5 {
    public static void main(String[] args) {
        System.out.println("Enter the Userid");
        String userid = System.console().readLine();
        System.out.println("Enter the Password");
        char[] pwd = System.console().readPassword();
        System.out.println("Userid "+userid);
        System.out.println("Password "+new String(pwd));
    }
}
