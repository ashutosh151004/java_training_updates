import java.util.Scanner;

public class areaofRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int breadth = sc.nextInt();
        areaofRectangle(length,breadth);
        System.out.println("Area of rectangle is: " +(length*breadth) );
        sc.close();
     }
     private static int  areaofRectangle(int length,int breadth){
     return(length*breadth);
}}
