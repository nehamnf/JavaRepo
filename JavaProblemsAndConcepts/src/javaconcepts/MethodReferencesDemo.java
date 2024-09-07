package javaconcepts;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesDemo {

    public static void main(String[] args) {
        // ArrayList to check the function
        List<Integer> al
                = Arrays.asList(1, 2, 3, 4);

        // Method reference. Here the instance or
        // object method is passed hence the object
        // name has been used
        al.forEach(System.out::println);

        // forEach() method takes the method reference
        // Being a static method, its reference can
        // be passed using the class name
        al.forEach(MethodReferencesDemo::printSquare);

        // Arrays of Strings
        String[] a = {"GfG", "IDE", "Courses"};
        String[] b = {"gfg", "ide", "courses"};

        // equals() method to compare ignoring
        // the cases
        // Third parameter is a comparator using
        // which we can define the basis of comparison
        if(Arrays.equals(
                a, b, String::compareToIgnoreCase))
            System.out.println("Yes");
        else
            System.out.println("No");

        MethodReferencesDemo mt = new MethodReferencesDemo();
        mt.usingLambdaExpression(a,b);


    }
    // Static method
    public static void printSquare(Integer x)
    {
        System.out.println(x*x);
    }

    public void usingLambdaExpression(String[] a, String[] b){
        System.out.println(Arrays.equals(a, b, (x1, x2)->x1.compareToIgnoreCase(x2)));
    }
}
