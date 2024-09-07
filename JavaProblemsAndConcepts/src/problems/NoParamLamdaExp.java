package problems;

interface Hello {
    public void sayHello();
}

interface Multiply {
    public int multiplyBy5(int n);
}

interface Add {
    public int addParameters(int a,int b);
}


public class NoParamLamdaExp {
    public static void main(String[] args) {
        //calling helperFunction of class Hello
        Hello h=helperFunction();

        //calling Interface method
        h.sayHello();

        System.out.println(helperFunctionMul().multiplyBy5(90));

        Add add = helperFunctionAdd();
        System.out.println(add.addParameters(5,4));

    }

    public static Hello helperFunction()
    {

        return ()-> System.out.println("Hello");
    }

    public static Multiply helperFunctionMul()
    {
            return (x) -> (x * 5);
    }

    public static Add helperFunctionAdd()
    {
        return (a,b) -> (a +b);
    }

}
