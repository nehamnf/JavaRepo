package javaconcepts.other.concepts;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder str
                = new StringBuilder("AAAABBBCCCC");

        // print string
        System.out.println("String = "
                + str);

        // reverse the string
        StringBuilder reverseStr = str.reverse();

        // print string
        System.out.println("Reverse String = "
                + reverseStr);

        // Append ', '(44) to the String
        str.appendCodePoint(44);

        // Print the modified String
        System.out.println("Modified StringBuilder = "
                + str);

        // get capacity
        int capacity = str.capacity();

        // print the result
        System.out.println("StringBuilder = " + str);
        System.out.println("Capacity of StringBuilder = "
                + capacity);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world!");
        System.out.println(sb); // Output: "Hello world!"

        sb.insert(6, "beautiful ");
        System.out.println(sb); // Output: "Hello beautiful world!"

        sb.reverse();
        System.out.println(sb.toString()); //
    }
}
