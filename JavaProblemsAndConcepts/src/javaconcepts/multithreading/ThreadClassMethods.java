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
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class ThreadClassMethods {
    public static void main(String[] args) throws InterruptedException {
        Thread t= new MyThreadMethods("My Thread");
        t.setDaemon(true);
        t.start();

//        Thread.sleep(6000);
//        System.out.println(Thread.currentThread());
        Thread.currentThread().join();


//        Thread.sleep(3000);
//        Thread.currentThread().setDaemon(true);
    }
}
