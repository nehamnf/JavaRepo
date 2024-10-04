package javaconcepts.other.concepts;

class OuterClassNested {
    // static member
    static int outer_x = 10;

    // instance(non-static) member
    int outer_y = 20;

    // private member
    private int outer_private = 30;

    // inner class
    class InnerClass {
        void display()
        {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);

            // can also access non-static member of outer
            // class
            System.out.println("outer_y = " + outer_y);

            // can also access a private member of the outer
            // class
            System.out.println("outer_private = "
                    + outer_private);
        }
    }
}

public class NestedInnerClassDemo {
    public static void main(String[] args)
    {
        // accessing an inner class
        OuterClassNested outerObject = new OuterClassNested();

        OuterClassNested.InnerClass innerObject
                = outerObject.new InnerClass();

        innerObject.display();
    }
}
