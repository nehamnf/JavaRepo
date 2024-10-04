package javaconcepts.other.concepts;

class classA {

    protected int x=10;
    // declaring a protected method m1()
    public void m1() { System.out.println("m1 method"); }
}

class classB extends classA {
        classA ab = new classA();

        public void extendedMethod(){
            System.out.println(ab.x);
            System.out.println("inside extended method");
            super.m1();
        }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        classA a = new classB();
        a.m1();

        classB b= new classB();
        b.m1();
        b.extendedMethod();

    }
}
