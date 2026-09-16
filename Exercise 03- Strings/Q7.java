public class Q7 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps";
        
        System.out.println("The given string is: " + str);
        
        // Convert to StringBuilder, reverse, and convert back to String
        String reversedStr = new StringBuilder(str).reverse().toString();
        
        System.out.println();
        System.out.println("The string in reverse order is:");
        System.out.println(reversedStr);
    }
}