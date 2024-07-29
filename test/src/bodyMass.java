import java.util.Scanner;

public class bodyMass {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter your weight in kilogram");
        double weight = sc.nextDouble();
        System.out.println("enter your height in meter ");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("your body mass index is " + BMI);
        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Normal weight");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Overweight");
        } else
            System.out.println("Obesity");
            sc.close();
        
    }
}
