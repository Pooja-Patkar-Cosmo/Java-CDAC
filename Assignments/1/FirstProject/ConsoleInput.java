import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleInput {
    // BufferedReader reads text from the character input stream efficiently.
    // System.in connects to standard console input.
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Helper method to read an integer from console
    public static int getInt() {
        try {
            // readLine() reads a whole line of text as a String.
            // Integer.parseInt() converts that String to a primitive int.
            String input = reader.readLine();
            return Integer.parseInt(input.trim());
        } catch (IOException e) {
            System.out.println("Error reading input. Setting default value 0.");
            return 0;
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format! Setting default value 0.");
            return 0;
        }
    }
}
