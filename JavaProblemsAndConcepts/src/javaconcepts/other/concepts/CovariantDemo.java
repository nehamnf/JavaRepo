package javaconcepts.other.concepts;

class A {

}

class B extends A {

}

class Base {

    // Method of this class of class1 return type
    A fun()
    {
        // Display message only
        System.out.println("javaconcepts.Base fun()");

        return new A();
    }
}

class Derived extends Base {

    // Method of this class of class1 return type
    B fun()
    {
        // Display message only
        System.out.println("javaconcepts.Derived fun()");

        return new B();
    }
}

public class CovariantDemo {
    public static void main(String[] args)
    {

        // Creating object of class3 type
        Base base = new Base();

        // Calling method fun() over this object
        // inside main() method
        base.fun();

        // Creating object of class4 type
        Derived derived = new Derived();

        // Again calling method fun() over this object
        // inside main() method
        derived.fun();
    }
}
