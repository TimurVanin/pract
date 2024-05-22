package prac18.ex7;
import java.util.Scanner;
public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key;
        do {
            System.out.print("Enter a key: ");
            key = myScanner.next();
        } while (key.equals(""));
        printDetails(key);
    }
    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}