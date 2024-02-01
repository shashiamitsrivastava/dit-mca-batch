import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        int count = 0;
       Scanner scanner = new Scanner("Hello How are You\n Hi This is Text\n Another text\n");
    //    while(scanner.hasNext()){
    //     scanner.next();
    //     count++;
    //     //System.out.println(scanner.next());
    //    }
    while(scanner.hasNextLine()){
        scanner.nextLine();
        count++;
        //System.out.println(scanner.next());
       }
       System.out.println("Line "+count);
       scanner.close();
    }
}
