import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintDemo {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream("/Users/amitsrivastava/Documents/mca-dit-java-dsa-code/result.txt"));
        System.out.println("Hello Java");
    }
}
