package javaconcepts;

import java.util.Random;

@FunctionalInterface
interface Supplier<T> {
    T get();

    // Default and other methods can be added here
}

public class SupplierFunctionalInterface {
    public static void main(String[] args) {

        //using Anonymous class
        Supplier<Double> randomSupplier = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };

        System.out.println("Random Double: " + randomSupplier.get()); // Output: Random Double: 0.37444887175646646

        //using lambda expressions
        Supplier<Double> randomSupplierLambda = () -> Math.random();
        System.out.println("Random Double: " + randomSupplierLambda.get()); // Output: Random Double: 0.37444887175646646

        //using normal class
        Supplier<Double> r= new RandomDoubleSupplier();
        System.out.println(r.get());
    }
}

// Normal class implementing Supplier<Double>
class RandomDoubleSupplier implements Supplier<Double> {
    private Random random = new Random();

    @Override
    public Double get() {
        return random.nextDouble();
    }
}
