package javaconcepts.other.concepts;

@FunctionalInterface
interface Function<T, R> {
    R apply(T t);

    // Default and other methods can be added here
}

@FunctionalInterface
interface BiFunction<T, U, R> {
    R apply(T t, U u);

    // Default methods like andThen can be added here
}

@FunctionalInterface
interface UnaryOperator<T> extends Function<T, T> {
    // Inherits apply(T t) from Function<T, R>
}


public class FunctionFunctionalInterface {
    public static void main(String[] args) {
        // Using an anonymous class to implement Function<String, Integer>
        Function<String, Integer> stringLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println("Length of 'Hello': " + stringLength.apply("Hello")); // Output: Length of 'Hello': 5

        //using
        Function<String,String> stringAppend = (s1) -> { return s1+" Hello";};
        System.out.println(stringAppend.apply("Neha"));

        //using normal class
        Function<String, Integer> s= new StringLengthFunction();
        System.out.println(s.apply("Neha"));

        //using biPredictive Functional interface
        // Using a lambda expression to implement BiFunction<Integer, Integer, Integer>
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println(add.apply(5, 3)); // Output: 8

        // Using a lambda expression to implement UnaryOperator<String>
        UnaryOperator<String> toUpperCase = str -> str.toUpperCase();
        System.out.println(toUpperCase.apply("hello")); // Output: HELLO


    }
}

// Normal class implementing Function<String, Integer>
class StringLengthFunction implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
