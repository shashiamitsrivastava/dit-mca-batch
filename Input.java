import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) throws IOException {
        //int single = System.in.read();
        // byte q [] = System.in.readAllBytes();
        // System.out.println(q);
        BufferedReader br  = new BufferedReader
        (new InputStreamReader(System.in));
        System.out.println("Enter the First Name");
        String name = br.readLine();
        System.out.println("Enter the Id");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Id "+id);
        System.out.println("Name "+name);
        br.close();
    }
}
