import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    // The shift key controls how many positions characters move
    private static final int SHIFT_KEY = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- SIMPLE FILE ENCRYPTION MENU ---");
            System.out.println("1. Encrypt File");     // Enter Path if the input file is not in tha same folder -> D:\POOJA\Input.txt
            System.out.println("2. Decrypt File");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear newline buffer

            if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            }

            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            System.out.print("Enter input file name (e.g., input.txt): ");
            String inputFile = scanner.nextLine();

            System.out.print("Enter output file name (e.g., output.txt): ");
            String outputFile = scanner.nextLine();

            if (choice == 1) {
                processFile(inputFile, outputFile, SHIFT_KEY);
                System.out.println("File encrypted successfully!");
            } else {
                // Decryption reverses the shift by making it negative
                processFile(inputFile, outputFile, -SHIFT_KEY);
                System.out.println("File decrypted successfully!");
            }
        }

        scanner.close();
    }

    // Reads character by character, shifts it, and writes to the new file
    private static void processFile(String inputFile, String outputFile, int shift) {
        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFile)) {

            int data;
            // reader.read() gets one character at a time as an integer
            while ((data = reader.read()) != -1) {
                char character = (char) data;

                // Shift the character code
                char shiftedCharacter = (char) (character + shift);

                // Write the transformed character
                writer.write(shiftedCharacter);
            }

        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}