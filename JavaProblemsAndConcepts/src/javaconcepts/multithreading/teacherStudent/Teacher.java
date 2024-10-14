package javaconcepts.multithreading.teacherStudent;

public class Teacher extends Thread {
    private  WhiteBoard w;
    private  String[] messages = {
            "Hello Neha",
            "Bangalore is Good",
            "Malaysia is Hot",
            "Where do you work?",
            "end"
    };

    public Teacher(WhiteBoard w) {
        this.w = w;
    }

    @Override
    public void run() {
        for (String message : messages) {
            w.write(message);
            try {
                Thread.sleep(1000);  // Simulate time taken to write
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Teacher thread interrupted.");
                break;
            }
        }
    }
}
