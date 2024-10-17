package javaconcepts.javaio;

import java.io.IOException;
import java.io.OutputStream;

public class Producer extends Thread {
    private final OutputStream os;
    private int count = 0;
    private static final int END_MARKER = -1; // Define an end-of-data marker

    public Producer(OutputStream os) {
        this.os = os;
    }

    @Override
    public void run() {
        try {
            while (count < 50) {
                os.write(count++);
                os.flush();
                System.out.println("Producer: " + (count - 1) + " " + Thread.currentThread().getName());
                Thread.sleep(2000); // Simulate delay
            }
            os.write(END_MARKER); // Send end-of-data marker after finishing
            os.flush();
            System.out.println("Producer: End of data sent.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace(); // Handle exceptions properly
        } finally {
            try {
                os.close(); // Close the OutputStream
            } catch (IOException e) {
                e.printStackTrace(); // Handle potential closing exceptions
            }
        }
    }
}
