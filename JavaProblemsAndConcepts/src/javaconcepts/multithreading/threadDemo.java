package javaconcepts.multithreading;

class Mythread extends  Thread {

    @Override
    public void run() {
        int i=1;
        while(true){
            System.out.println("i :"+i+" Hello From Thread class");
            i++;
//            try {
////                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
        }
    }
}
public class threadDemo {

//    static void display(){
//        int i=1;
//        while(true){
//            System.out.println("i :"+i+" Hello From Action");
//            i++;
//        }
//    }
    public static void main(String[] args) throws InterruptedException {
//        display();
        Thread t= new Mythread();
        System.out.println(t.getName());
        System.out.println(t.getId());
        System.out.println(t.getPriority());
        System.out.println(t.getContextClassLoader());
        t.start();
//        t.interrupt();
        int i=1;
        while(true){
            System.out.println("i :"+i+" Hello From Main");
            i++;
//            Thread.sleep(1000);
            Thread.yield();

        }
    }

}
