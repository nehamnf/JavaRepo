package javaconcepts.multithreading;


class MyClass {
    int value;
    boolean flag=true;
    public synchronized void setValue(int v){
        while (!flag){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        value=v;
        flag=false;
        notifyAll();
    }

    public synchronized int getValue(){
        while (flag){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        int x=0;
        x=value;
        flag=true;
        notifyAll();
        return x;

    }

}

class Producer extends Thread{
    MyClass myClass;

    public Producer(MyClass myClass){
        this.myClass=myClass;
    }
    public void run(){
        int i=1;
        while(true) {
            myClass.setValue(i);
            System.out.println("Producer: "+i);
            i++;
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}

class Consumer extends Thread{
    MyClass myClass;

    public Consumer(MyClass myClass){
        this.myClass=myClass;
    }
    public void run(){
        int value;
        while(true) {
            value= myClass.getValue();
            System.out.println("Consumer: "+value);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
public class InterThreadCommunication {
}
