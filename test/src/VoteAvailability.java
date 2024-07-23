import java.util.*;
public class VoteAvailability {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        String eligible = (age>=18) ? "eligible" : "noteligible";
        System.out.println(eligible);
    }
    }
