class Test {
    interface Yes {
        void show();
    }

    public void testMethod(){
        System.out.println("Test Method");
    }
}

class Testing implements Test.Yes {
    public void show()
    {
        System.out.println("show method of interface");
    }

    public  void toCheckAnonymous(){
        System.out.println("Inside the class Testing to check anonymous class");
    }
}

class TestClass extends Test{
    public void classMethod(){
        System.out.println("Method inside the class");
    }

    @Override
    public void testMethod() {
        System.out.println("testMethod inside the extended class");
    }
}

public class NestedInterfaceDemo {
    public static void main(String[] args)
    {
        Test.Yes obj;
        Testing t = new Testing();
        obj = t;
        obj.show();

        Test.Yes t2 = new Testing();
        t2.show();

        Testing test = new Testing();
        test.toCheckAnonymous();

        TestClass t3 = new TestClass();
        t3.classMethod();

        Test t4 = new TestClass();
        t4.testMethod();

        Test.Yes tanonymous = new Test.Yes() {
            @Override
            public void show() {
                System.out.println("inside anonymous nested method");
            }
        };

    }

}
