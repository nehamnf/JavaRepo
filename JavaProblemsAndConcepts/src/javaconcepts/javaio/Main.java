package javaconcepts.javaio;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        PipedInputStream pi= new PipedInputStream();
        PipedOutputStream po= new PipedOutputStream();
        pi.connect(po);
        Producer p= new Producer(po);
        Producer p2= new Producer(po);
        Consumer c= new Consumer(pi);
        Consumer c2= new Consumer(pi);
        p.start();
        p2.start();
        c.start();
        c2.start();
    }
}
