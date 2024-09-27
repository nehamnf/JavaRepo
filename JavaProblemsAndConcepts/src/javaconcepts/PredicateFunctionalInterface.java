package javaconcepts;

@FunctionalInterface
interface Predicate<T> {
    boolean test(T t);

    // Default and other methods can be added here
}

@FunctionalInterface
interface BiPredicate<T, U> {
    boolean test(T t, U u);

    // Default methods like and, or, negate can be added here
}

public class PredicateFunctionalInterface {
    public static void main(String[] args) {

        //using anonymous class
        Predicate<String> p= new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("N");
            }
        };
        System.out.println(p.test("Neha"));

        //using lambda expression
        Predicate<String> pLambda = ( s)-> s.startsWith("N");
        System.out.println(pLambda.test("Neha"));

        //using normal class
        PredicateExample pNormal = new PredicateExample();
        System.out.println(pNormal.test("NehaMN"));

        //using BiPredicate
        // Using a lambda expression to implement BiPredicate<String, Integer>
        BiPredicate<String, Integer> isLengthMatching = (s, length) -> s.length() == length;

        System.out.println(isLengthMatching.test("Hello", 5)); // Output: true
        System.out.println(isLengthMatching.test("World", 4)); // Output: false
    }
}

class PredicateExample implements Predicate<String>{

    @Override
    public boolean test(String s){
        return s.startsWith("N");
    }
}
