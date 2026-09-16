public class Q3 {
    public static void main(String[] args) {
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";
        String suffix = "se";
        
        boolean ends1 = str1.endsWith(suffix);
        boolean ends2 = str2.endsWith(suffix);
        
        System.out.println("\"" + str1 + "\" ends with \"" + suffix + "\"? " + ends1);
        System.out.println("\"" + str2 + "\" ends with \"" + suffix + "\"? " + ends2);
    }
}