package javaconcepts.multithreading;


class MyData {
    public synchronized void display(String s){
//       synchronized (this) {
           for (int i = 0; i < s.length(); i++) {
               System.out.print(s.charAt(i));
           }
//       }
    }
}

class Thread1 extends Thread{

    MyData d;

    public Thread1(MyData d){
        this.d=d;
    }

    @Override
    public void run() {
        d.display("Hello NehaFarheen MN from Mysore");
        System.out.println();
    }
}

class Thread2 extends Thread{

    MyData d;

    public Thread2(MyData d){
        this.d=d;
    }

    @Override
    public void run() {
        d.display("WELCOME");
    }
}
public class SynchronizationDemo {

    public static void main(String[] args) {
        MyData d= new MyData();
        Thread t1=new Thread1(d);
        Thread t2= new Thread2(d);
        t1.start();
        t2.start();
    }
}
