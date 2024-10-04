package javaconcepts.other.concepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    static void removeEven(Collection<Integer> c)
    {
        // Generates an Iterator it
        Iterator<Integer> it = c.iterator();

        // Checks for the next element to the it
        while(it.hasNext())
        {
            // Returns the next element to Iterator
            // Moves the iterator to next position
            int x = (Integer)it.next();

            // Check whether x is even or not
            if(x % 2 == 0)
                // Removes the element just before the it
                it.remove();
        }
    }
    public static void main(String[] args) {
        // Takes Collection as an argument


// ArrayList is created with variable of Collection
// type. The ArrayList can be replaced with any
// Collection be it LinkedList, ArrayDeque, HashSet etc.
        Collection<Integer> c = new ArrayList<Integer>();

// Added elements to the ArrayList
        c.add(10);
        c.add(15);
        c.add(20);
        c.add(25);

// Function too remove Even elements
        removeEven(c);
        System.out.println(c);
    }
}
