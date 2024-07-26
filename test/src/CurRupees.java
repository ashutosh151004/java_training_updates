
import java.util.Scanner;

public class CurRupees {
    public static void print_detail(){
        System.out.println(" 1. INR to Dollar\n 2. INR to Euro\n 3. INR to Pound\n 4. INR to Dinar\n 5. INR to Yen");
    }
    public static void main(String[] args) {
        float takeNumber;
        float result;
        System.out.println("\nCurrency converter program");
        print_detail();

        System.out.println("Select the currency you want to convert");
        Scanner sc = new Scanner(System.in);
        int takeInput;
        takeInput = sc.nextInt();
        switch (takeInput) {

            case 1 :
            System.out.println("Enter Rupees to convert INR to Dollar");
            takeNumber = sc.nextFloat();
            result = (float) (takeNumber*0.012); 
            System.out.println("INR to Dollar is: "+result);
                break;
                case 2 :
                System.out.println("Enter Rupees to convert INR to Euro");
            takeNumber = sc.nextFloat();
            result = (float) (takeNumber*0.011); 
            System.out.println("INR to Euro is: "+result);
                break;
                case 3 :
                System.out.println("Enter Rupees to convert INR to Pound");
            takeNumber = sc.nextFloat();
            result = (float) (takeNumber*0.0093); 
            System.out.println("INR to Pound is: "+result);
                break;
                case 4 :
                System.out.println("Enter Rupees to convert INR to Dinar");
            takeNumber = sc.nextFloat();
            result = (float) (takeNumber*0.0037); 
            System.out.println("INR to Dinar is: "+result);
                break;
                case 5 :
                System.out.println("Enter Rupees to convert INR to Yen");
            takeNumber = sc.nextFloat();
            result = (float) (takeNumber*1.84); 
            System.out.println("INR to Yen is: "+result);
                break;
            default:
            System.out.println("Invalid Input");
            break;
        }
        sc.close();
    }
}