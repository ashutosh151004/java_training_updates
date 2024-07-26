
import java.util.Scanner;

public class classobjects {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        System.out.println("Enter the Trainer name: ");
        Scanner sc = new Scanner(System.in);
        trainer.trainerName = sc.nextLine();
        System.out.println("Enter the Technology name: ");
        trainer.tecnology = sc.nextLine();
        System.out.println(trainer.trainerName + trainer.tecnology);

        Student student = new Student();
        System.out.println("Enter the Student name: ");
        student.studentName = sc.nextLine();
        System.out.println("Enter the Technolgy of Student");
        student.enrolledTechnology = sc.nextLine();
    }

}
class Trainer{
    String trainerName;
    String tecnology;
}
class Student{
    String studentName;
    String enrolledTechnology;
}
