import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Colors02 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Blue");
        list1.add("Green");
        list1.add("Lavender");
        list1.add("Cyan");
        list1.add("Red");

        // Q8 Modify the above Java program to copy one array list into another.
        // Copy list1 into a brand new list (list2)
        ArrayList<String> list2 = new ArrayList<>(list1);

        System.out.println();
        System.out.println("Original List (list1): " + list1);
        System.out.println("Copied List   (list2): " + list2);


        // Q9 Modify the above Java program to shuffle elements in an array list.
        System.out.println();
        System.out.println("Before shuffle: " + list1);
        Collections.shuffle(list1);
        System.out.println("After shuffle:  " + list1);

        // Q10 Modify the above Java program to reverse elements in an array list
        System.out.println();
        System.out.println("Before reverse: " + list1);
        Collections.reverse(list1);
        System.out.println("After reverse:  " + list1);

        System.out.println("---------------------------------------------------------");
        // Q11 Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String> treeSet1 = new TreeSet<>();

        treeSet1.add("Blue");
        treeSet1.add("Green");
        treeSet1.add("Lavender");
        treeSet1.add("Cyan");
        treeSet1.add("Red");

        // automatically sorted
        System.out.println("treeSet1 : " + treeSet1);

        // Q12 Modify the above Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> treeSet2 = new TreeSet<>();

        treeSet2.addAll(treeSet1);

        System.out.println();
        System.out.println("First TreeSet  (treeSet1): " + treeSet1);
        System.out.println("Second TreeSet (treeSet2): " + treeSet2);


        // Q13 Modify the above Java program to create a reverse order view of the elements contained in a given tree set.
        System.out.println();
        System.out.println("Original TreeSet: " + treeSet1);
        System.out.println("Reverse order view: " + treeSet1.descendingSet());


        // Q14 Modify the above Java program to get the first and last elements in a tree set.
        System.out.println();
        System.out.println("First Element: " + treeSet1.first());
        System.out.println("Last Element:  " + treeSet1.last());



        // Q15 Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        // (Hint: Use the ceiling method of the TreeSet)
        // alphabetical string comparison
        System.out.println();
        System.out.println("TreeSet: " + treeSet1);

        // Exact match ("Green" exists) -> returns "Green"
        System.out.println("Ceiling for 'Green': " + treeSet1.ceiling("Green"));

        // No exact match ("Dark Blue" lies between "Cyan" and "Green") -> returns "Green"
        System.out.println("Ceiling for 'Dark Blue': " + treeSet1.ceiling("Dark Blue"));

        // Value greater than all elements ("Yellow") -> returns null
        System.out.println("Ceiling for 'Yellow': " + treeSet1.ceiling("Yellow"));



    }
}
