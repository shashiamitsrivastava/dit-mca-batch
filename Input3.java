import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the Id ");
       int id = scanner.nextInt(); // 1001\n
       scanner.nextLine(); // eat \n
       System.out.println("Enter the Name");
       String name = scanner.nextLine();
       
       System.out.println("Enter the City");
       String city = scanner.next();
       System.out.println("Id "+id);
       System.out.println("Name "+name);
       System.out.println("City "+city);
       //scanner.close(); 
       //scanner = new Scanner(System.in);
       System.out.println("Enter the Phone");
       String phone = scanner.next();
       System.out.println("Phone "+phone);
       scanner.close();
    }
}
