import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        // 1. Sort a string array in alphabetical order
        Consumer<String[]> sortStrings = arr -> Arrays.sort(arr);

        // 2. Find the largest number in an integer array
        Function<int[], Integer> findMax = arr -> {
            int max = arr[0];
            for (int num : arr) {
                if (num > max) max = num;
            }
            return max;
        };

        // 3. Find the smallest number in an integer array
        Function<int[], Integer> findMin = arr -> {
            int min = arr[0];
            for (int num : arr) {
                if (num < min) min = num;
            }
            return min;
        };

        // 4. Generate a 3-digit random number (100 to 999)
        Supplier<Integer> generate3DigitRandom = () -> new Random().nextInt(900) + 100;

        // 5. Take an integer array and return the reverse integer array
        Function<int[], int[]> reverseArray = arr -> {
            int[] reversed = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                reversed[i] = arr[arr.length - 1 - i];
            }
            return reversed;
        };

        // 6. Print the current date (Using java.util.Date)
        Runnable printCurrentDate = () -> System.out.println(new Date());

        // 7. Evaluate if a number is a Prime number
        Predicate<Integer> isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        // 8. Accept 2 strings and return the concatenated value (Using BiFunction)
        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + str2;


        // Quick Verification Runs:
        String[] words = {"Banana", "Apple", "Cherry"};
        sortStrings.accept(words);
        System.out.println("Sorted: " + Arrays.toString(words));

        int[] numbers = {45, 12, 89, 3, 67};
        System.out.println("Largest: " + findMax.apply(numbers));
        System.out.println("Smallest: " + findMin.apply(numbers));
        System.out.println("3-Digit Random: " + generate3DigitRandom.get());
        System.out.println("Reversed: " + Arrays.toString(reverseArray.apply(numbers)));

        System.out.print("Current Date: ");
        printCurrentDate.run();

        System.out.println("Is 29 Prime? " + isPrime.test(29));
        System.out.println("Concatenation: " + concatenate.apply("Hello, ", "World!"));
    }
}


/*
Using existing (pre-defined) Functional Interfaces in Java write,
    1. Lambda expression to sort a string array in alphabetical order
    2. Lambda expression to find the largest number in an integer array.
    3. Lambda expression to find the smallest number in an integer array.
    4. Lambda expression to generate a 3 digit random number
    5. Lambda expression that takes an integer array and returns the reverse integer array
    6. Lambda expression to print the current date
    7. Lambda expression to evaluate if a number entered is a Prime number
    8. Lambda expression to accept 2 strings and return the concatenated value of the same


 */