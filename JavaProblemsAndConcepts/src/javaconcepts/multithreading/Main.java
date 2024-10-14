package javaconcepts.multithreading;

public class Main {
    public static void main(String[] args) {
         MyClass m= new MyClass();
         Producer p= new Producer(m);
         Consumer c= new Consumer(m);
         p.start();
         c.start();
    }
}
