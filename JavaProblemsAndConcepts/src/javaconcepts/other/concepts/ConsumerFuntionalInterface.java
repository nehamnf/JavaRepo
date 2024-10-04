package javaconcepts.other.concepts;

/*
Consumer<T>
Interface Definition
Usage with Anonymous Class
Usage with Lambda Expression
Usage with Normal Class

*/

@FunctionalInterface
interface Consumer<T> {
    void accept(T t);
}

@FunctionalInterface
interface BiConsumer<T, U> {
    void accept(T t, U u);

    // Default methods like andThen can be added here
}

public class ConsumerFuntionalInterface {
    public static void main(String[] args) {

        // Using an anonymous class to implement Consumer<String>
        Consumer<String> printer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        printer.accept("Hello from Consumer Anonymous Class!"); // Output: Hello from Anonymous Class!

        // Using a lambda expression to implement Consumer<String>
        Consumer<String> printerLambda = s -> System.out.println(s);
        printerLambda.accept("Hello from Consumer Lambda Expression!"); // Output: Hello from Lambda Expression!

        //using normal class
        Printer p= new Printer();
        // Instantiate the normal class
        //Consumer<String> printer = new Printer();
        p.accept("Hello from Normal Consumer class");

        //biconsumer example
        // Using a lambda expression to implement BiConsumer<String, Integer>
        BiConsumer<String, Integer> printKeyValue = (key, value) -> System.out.println(key + " = " + value);

        printKeyValue.accept("Age", 30); // Output: Age = 30
    }


}
// Normal class implementing Consumer<String>
class Printer implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }

//    // Normal class implementing Consumer<String> USING GENERICS
//    class Printer<T> implements Consumer<T> {
//        @Override
//        public void accept(T t) {
//            System.out.println(t);
//        }

}