
import java.util.Random;

public class Otp {
    public static void main(String[] args) {
        Random random = new Random();
        int myOTP = random.nextInt(100000);
        System.out.println("Your OTP is " + myOTP);
    }
}
