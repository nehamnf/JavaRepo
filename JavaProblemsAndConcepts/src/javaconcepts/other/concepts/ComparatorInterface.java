package javaconcepts.other.concepts;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorInterface {
    public static void main(String[] args) {

        //using anonymous class
        Comparator<String> stringLengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        System.out.println(stringLengthComparator.compare("nehamn","safi"));

        String[] words = {"apple", "cherry", "banana", "date"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Compare based on string length
                return Integer.compare(s1.length(), s2.length());
            }
        });

        System.out.println("Custom sorting based on length of string: "+Arrays.toString(words));

        //using lambda expression
        Integer[] numbers = {5, 2, 9, 1, 5, 6};

        //custom sorting
        Arrays.sort(numbers, (a, b) -> b - a); // Reverse order

        System.out.println(Arrays.toString(numbers));
        // Output: [9, 6, 5, 5, 2, 1]

    }
}
