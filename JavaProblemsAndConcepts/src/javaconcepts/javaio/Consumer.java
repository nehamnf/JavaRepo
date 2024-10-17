package javaconcepts.javaio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Consumer extends Thread {
    private final InputStream is;
    int b;
    private volatile boolean running = true;

    public Consumer(InputStream is){
        this.is=is;
    }
    @Override
    public void run(){
        try {
            while (running) {
                int b = is.read(); // Read a byte
                if (b == -1) {
                    System.out.println("End of stream reached.");
                    break; // End of stream
                }
                System.out.println("Consumer: " + b + " " + Thread.currentThread().getName());
            }
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        } finally {
            // Clean up resources
            try {
                is.close(); // Close the InputStream
            } catch (IOException e) {
                System.err.println("Failed to close InputStream: " + e.getMessage());
            }
        }
    }
}
