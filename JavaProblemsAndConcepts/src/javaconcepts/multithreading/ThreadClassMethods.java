package javaconcepts.multithreading;

class MyThreadMethods extends Thread{

    public MyThreadMethods(String name){
        super(name);
//        this.setName("My Thread");
    }
    @Override
    public void run() {
        int i=1;
        while(true){
            System.out.println("i :"+i+++" Hello From Thread class");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class ThreadClassMethods {
    public static void main(String[] args) {
        Thread t= new MyThreadMethods("My Thread");
        t.start();
        System.out.println(t.getName());
    }
}
