package javaconcepts;

import java.util.ArrayList;
import java.util.List;

public class CollectionsBulkOperations {
    public static void main(String[] args) {
        // Creating an empty list
        List<Integer> list1 = new ArrayList<Integer>();

        // Use add() method to add elements
        // into the List
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(11);
        list1.add(13);

        // Creating another empty List
        List<Integer> list2 = new ArrayList<Integer>();

        // Adding elements to list2
        list2.add(10);
        list2.add(30);

        // Returns true if all the elements of list2
        // is present in list1 or not
        System.out.println(list1.containsAll(list2));

        list1.addAll(list2);
        System.out.println(list1);

        List<Integer> list3 = new ArrayList<>();
        list3.add(30);

        list1.removeAll(list3);
        System.out.println(list1);

        list3.add(10);
        list1.retainAll(list3);
        System.out.println(list1);


        list1.add(15);
        list1.add(20);
        list1.removeIf(n -> (n % 2 == 0));
        System.out.println(list1);
    }
}
