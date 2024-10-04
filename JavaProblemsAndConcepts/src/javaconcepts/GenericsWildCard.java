package javaconcepts;

import java.util.ArrayList;
import java.util.List;

// Superclass
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "'}";
    }
}

// Subclass of Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " barks.");
    }

    @Override
    public String toString() {
        return "Dog{name='" + getName() + "'}";
    }
}

// Subclass of Dog
class Bulldog extends Dog {
    public Bulldog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " growls.");
    }

    @Override
    public String toString() {
        return "Bulldog{name='" + getName() + "'}";
    }
}

// Subclass of Bulldog
class BulldogPlus extends Bulldog {
    public BulldogPlus(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " growls loudly.");
    }

    @Override
    public String toString() {
        return "BulldogPlus{name='" + getName() + "'}";
    }
}

public class GenericsWildCard {

    // Generic method using lower bounded wildcard
    public static <T> void addToList(List<? super T> list, T element) {
        list.add(element); // Allowed: Adding T or its subtype
        // Cannot retrieve as T; only as Object
        Object obj = list.get(0);
        System.out.println("Added element: " + element);
    }

    public static void main(String[] args) {

//        Animal al = new Dog("puppy");

        // Creating a list that can hold Dog or its supertypes
        List<? super Dog> dogList = new ArrayList<Animal>();

        // Adding Dog and its subtypes - Allowed
        addToList(dogList, new Dog("Buddy"));
        addToList(dogList, new Bulldog("Bruno"));
        addToList(dogList, new BulldogPlus("Max"));

        // Attempting to add an Animal (supertype) - Should cause Compilation Error
        // addToList(dogList, new Animal("Generic Animal")); // Uncommenting this line will cause an error

        // Attempting to add an Object - Should cause Compilation Error
        // addToList(dogList, new Object()); // Uncommenting this line will cause an error

        // Displaying the contents of the list
        System.out.println("\nContents of dogList:");
        for (Object obj : dogList) {
            System.out.println(obj);
        }

        // Retrieving elements as Object
        Object firstElement = dogList.get(0);
        System.out.println("\nFirst element retrieved as Object: " + firstElement);
    }
}
