public class Add {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i<args.length; i++){
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Result is "+sum);
        // Command Line Arguments
        // String firstName = args[0];
        // String lastName = args[1];
        // System.out.println(firstName + lastName);
        // if(args.length==2){
        // int firstNumber = Integer.parseInt(args[0]);
        // int secondNumber = Integer.parseInt(args[1]);
        // int result = firstNumber + secondNumber;
        // System.out.println(result);
        // }
        // else{
        //     System.out.println("Invalid Number of Args");
        // }

    }
}
