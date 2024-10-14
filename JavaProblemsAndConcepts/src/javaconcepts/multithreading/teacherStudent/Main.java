package javaconcepts.multithreading.teacherStudent;

public class Main {
    public static void main(String[] args) {
        WhiteBoard w = new WhiteBoard();
        Teacher t = new Teacher(w);
        Student s1 = new Student("1. Neha", w);
        Student s2 = new Student("2. Safi", w);
        Student s3 = new Student("3. Naseem", w);
        Student s4 = new Student("4. Suhail", w);

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();

        try {
            t.join();  // Wait for the teacher to finish
            s1.join();
            s2.join();
            s3.join();
            s4.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads have completed.");
    }
}
