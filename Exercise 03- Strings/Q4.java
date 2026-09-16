public class Q4 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";

        // Loop through characters from 'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = str.indexOf(ch);
            System.out.printf("%-3c", ch);
        }
        System.out.println("\n=============================================================================");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = str.indexOf(ch);
            System.out.printf("%-3d", index);
        }
        System.out.println();
    }
}
