import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double avg;
        int sum = 0,min = 0,max =0,n;
        System.out.println("Please enter the number of elements you want to enter: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        for (int i = 0; i<n; i++) {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min);
            {
                min = arr[i];
            }
            sum = sum+arr[i];
        }
        avg = sum / arr.length;
        System.out.println("Max:" +max);
        System.out.println("Min:" +min);
        System.out.println("Average:" +avg);
        }
    }
