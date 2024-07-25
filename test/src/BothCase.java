
import java.util.Scanner;

public class BothCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String inputString = sc.nextLine();

        String uppercaseString = inputString.toUpperCase();
        System.out.println("UpperCase String is: " +uppercaseString);

        String lowercaseString = inputString.toLowerCase();
        System.out.println("LowerCase String is: " +lowercaseString);

        sc.close();
    }
}
