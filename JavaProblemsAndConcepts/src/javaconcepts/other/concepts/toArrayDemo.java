package javaconcepts.other.concepts;

import java.util.ArrayList;
import java.util.List;

public class toArrayDemo {
    public static void main(String[] args) {
        // Creating a list of ArrayList
        List<Integer> list = new ArrayList<Integer>();

        // Being a collection we can also create a
        // queue by just replacing the statement
        // with this
        // Queue<Integer> q = new ArrayDeque<Integer>();

        // Adding elements to the ArrayList
        list.add(10);
        list.add(15);
        list.add(20);

        // Converting the ArrayList to an array of
        // Object type
        Object[] arr = list.toArray();

        // Printing array of objects
        for (Object x : arr)
            System.out.println(x + " ");

        System.out.println("--------------------------T[] toArray(T[])------------------------------------");

        // Creating a list of ArrayList
        List<Integer> list1 = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        list1.add(10);
        list1.add(15);
        list1.add(20);

        // Converting an array of Integer type
        Integer[] arrInt = new Integer[list1.size()];

        // Converts the list to array of type arr
        arrInt = list.toArray(arrInt);

        // Printing array of objects
        for (Integer x : arrInt)
            System.out.println(x + " ");
    }
}
