import java.util.Random;
import java.util.function.Supplier;

public class OtpGenerator {

    public static void main(String[] args) {
        // Lambda expression to generate OTP: 1 Vowel + 4 Random Digits
        Supplier<String> generateOtp = () -> {
            char[] vowels = {'A', 'E', 'I', 'O', 'U'};
            Random random = new Random();

            char vowel = vowels[random.nextInt(vowels.length)];

            // Generate a 4-digit number (formatted with leading zeros if needed)
            int numbers = random.nextInt(10000);

            return String.format("%c%04d", vowel, numbers);
        };

        // Test the Lambda
        System.out.println(generateOtp.get());
        System.out.println(generateOtp.get());
        System.out.println(generateOtp.get());
    }
}


