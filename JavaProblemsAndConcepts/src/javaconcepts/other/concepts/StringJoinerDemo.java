package javaconcepts.other.concepts;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();


        al.add("Ram");
        al.add("Shyam");
        al.add("Alice");
        al.add("Bob");

        //using string
        String join = String.join(",",al);
        System.out.println("---"+join);

        //using string joiner
        StringJoiner sj1 = new StringJoiner(",");
        sj1.setEmptyValue("sj1 is empty");
        System.out.println(sj1);


        sj1.add(al.get(0)).add(al.get(1));
        System.out.println(sj1);

        System.out.println("Length of sj1 : "
                + sj1.length());

        StringJoiner sj2 = new StringJoiner(":");
        sj2.add(al.get(2)).add(al.get(3));

        sj1.merge(sj2);
        System.out.println(sj1);

        System.out.println("Length of new sj1 : "
                + sj1.length());


        StringJoiner joiner = new StringJoiner(", "); // Create a StringJoiner with a comma and space as the delimiter

        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");

        String result = joiner.toString();
        System.out.println(result); // Output: Apple, Banana, Cherry

        StringJoiner joiner1 = new StringJoiner(", ", "[", "]"); // Creates a StringJoiner with prefix '[' and suffix ']'

        joiner1.add("Java");
        joiner1.add("Python");
        joiner1.add("C++");

        String result1 = joiner.toString();
        System.out.println(result1); // Output: [Java, Python, C++]

    }

}
