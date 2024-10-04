package javaconcepts.other.concepts;

import java.util.Arrays;
import java.util.List;

public class IteratingThroughCollections {
    public static void main(String[] args) {
        // ArrayList containing elements
        List<Integer> al
                = Arrays.asList(
                10, 20, 5, 3, 40);

        // for-each loop to traverse through
        for(Integer x: al)
            System.out.print(x + " ");

        // Using forEach() method to traverse
        al.forEach(x -> System.out.println(x));

        // The above expression can be replaced
        // by a Method reference
        // al.forEach(System.out::println);


        // Using stream to traverse and
        // print elements with a space
        al.stream().forEach(x -> System.out.print(x + "-"));

        System.out.println();

        // First creating a stream over the ArrayList
        // Filtering the elements greater than 10
        // Filtering the even elements
        // Printing the list with space
        al.stream()
                .filter(x -> x > 10)
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.print(x + " "));
    }
}
