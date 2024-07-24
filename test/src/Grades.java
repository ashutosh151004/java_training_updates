import java.util.*;
public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the marks of student");
        int marks = sc.nextInt();80
        switch(marks)
        {
            case 10:
            System.out.println("fail");
            break;
            case 50:
            System.out.println("D grade");
            break;
            case 80:
            System.out.println("A grade");
            break;
            default:
            System.out.println("Invalid");
        }
    }
}
