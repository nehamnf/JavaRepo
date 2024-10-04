package javaconcepts.other.concepts;

interface intfA {
    void geekName();
}

interface intfB {
    void geekInstitute();
}

interface intfC extends intfA, intfB {
    void geekBranch();
}

class InterfaceDemo implements intfC {
    @Override
    public void geekName() { ; }

    @Override
    public void geekInstitute()
    {
        System.out.println("NIT");
    }

    @Override
    public void geekBranch() { System.out.println("CSE"); }

    public void classMethod(){
        System.out.println("this class method of javaconcepts.InterfaceDemo");
    }

    public static void main(String[] args)
    {
        InterfaceDemo ob1 = new InterfaceDemo();

        ob1.geekName();
        ob1.geekInstitute();
        ob1.geekBranch();
        ob1.classMethod();

        intfC infC = new InterfaceDemo();
        infC.geekName();
        infC.geekBranch();

        //can not call the classMethod using the type of javaconcepts.intfC as the object created in heap is of type javaconcepts.InterfaceDemo
        //infC.classMethod();
    }
}
