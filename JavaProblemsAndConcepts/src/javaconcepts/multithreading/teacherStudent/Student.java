package javaconcepts.multithreading.teacherStudent;

public class Student extends Thread {
    private  String name;
    private WhiteBoard w;

    public Student(String name, WhiteBoard w) {
        this.name = name;
        this.w = w;
    }

    @Override
    public void run() {
        w.attendance();  // Register attendance
        String text;

        while (true) {
            text = w.read();  // Read from the WhiteBoard

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (text.equals("end")) {
                System.out.println(name + " Reading: " + text + " (ending reading)");
                break;  // Exit the loop if "end" is read
            }
            System.out.println(name + " Reading: " + text);
        }
    }
}
