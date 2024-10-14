package javaconcepts.multithreading;

class FeatureToggle {
    private  volatile boolean  featureEnabled = false; // Volatile flag

    public void setFeatureEnabled(boolean enabled) {
        featureEnabled = enabled; // Update the feature flag
    }

    public void performTask() {
        if (featureEnabled) {
            System.out.println("Feature is enabled. Performing task...");
            // Code for the feature goes here
        } else {
            System.out.println("Feature is disabled. Skipping task...");
        }
    }
}

public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        FeatureToggle toggle = new FeatureToggle();

        // Simulate multiple threads checking the feature flag
        Thread worker1 = new Thread(() -> {
            while (true) {
                System.out.println("thread 1");
                toggle.performTask();
                try {
                    Thread.sleep(300); // Simulating work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread worker2 = new Thread(() -> {
            while (true) {
                System.out.println("thread 2");
                toggle.performTask();
                try {
                    Thread.sleep(300); // Simulating work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        worker1.start();
        worker2.start();

        // Let the workers run for 2 seconds
        Thread.sleep(2000);

        // Enable the feature
        toggle.setFeatureEnabled(true);

        // Let it run for a bit longer
        Thread.sleep(2000);

        // Stop the threads (in a real application, you'd handle this properly)
        worker1.interrupt();
        worker2.interrupt();
    }
}
