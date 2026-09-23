import java.util.ArrayList;
import java.util.Collections;

public class Colors01{
    public static void main(String [] args){

        ArrayList<String> colors = new ArrayList<>();

        // Q1 Write a Java program to create a new array list, add some colors (string), and print out the collection.
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Lavendar");

        System.out.println("Colors in the list : " + colors);


        // Q2 Modify the above Java program to insert an element into the array list at the first position.
        // Insert "Purple" at index 0 (the first position)
        colors.add(0, "Cyan");

        System.out.println("-------------------------------------------------------------------------------\n");
        System.out.println("Updated List: " + colors);


        // Q3 - Retrieve the element at index 2 (3rd element)
        String result = colors.get(2);

        System.out.println();
        System.out.println("Element at index 2: " + result);


        //Q4 Modify the above Java program to update a specific array element by a given element.
        colors.set(1, "Yellow");

        System.out.println();
        System.out.println("Updated List: " + colors);


        // Q5 Modify the above Java program to remove the third element from an array list.
        colors.remove(2);

        System.out.println();
        System.out.println("Updated List: " + colors);

        // Q6 Modify the above Java program to search an element in an array list.
        String searchColor = "Yellow";

        System.out.println();
        if (colors.contains(searchColor)) {
            System.out.println("Found " + searchColor + " at index: " + colors.indexOf(searchColor));
        } else {
            System.out.println(searchColor + " is not in the list.");
        }


        // Q7 Modify the above Java program to sort a given array list. (Hint: Use the class Collections)
        System.out.println();
        System.out.println("Before sorting: " + colors);
        Collections.sort(colors);
        System.out.println("After sorting:  " + colors);





    }
}
