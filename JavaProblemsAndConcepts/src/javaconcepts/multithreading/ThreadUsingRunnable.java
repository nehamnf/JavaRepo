package javaconcepts.multithreading;

class MythreadRunnable implements  Runnable{

    @Override
    public void run() {
        int i=1;
        while(true){
            System.out.println("i :"+i+" Hello From ThreadRunnable class");
            i++;
        }
    }
}

public class ThreadUsingRunnable {
    public static void main(String[] args) {

        Runnable t= new MythreadRunnable();
        Thread th= new Thread(t);
        th.start();
        int i=1;
        while(true){
            System.out.println("i :"+i+" Hello From Main ");
            i++;
        }
    }
}
