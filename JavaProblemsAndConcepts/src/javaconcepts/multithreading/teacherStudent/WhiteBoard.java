package javaconcepts.multithreading.teacherStudent;

public class WhiteBoard {
    private String text;
    private  int numberOfStudents = 0;  // Total number of students
    private int studentsRead = 0;        // Count of students who have read the current message

    public void attendance() {
        numberOfStudents++;  // Increment the number of registered students
    }

    public synchronized void write(String t) {
        // Wait until all students have read the previous message
        while (studentsRead < numberOfStudents) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(e);
            }
        }
        text = t;  // Update the text to be read
        System.out.println("Teacher is writing: " + text);
        studentsRead = 0;  // Reset the read count for the new message
        notifyAll();  // Notify all students to read
    }

    public synchronized String read() {
        // Wait for the teacher to write
        while (studentsRead == numberOfStudents) {
            try {
                wait();  // Wait if all students have read the previous message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(e);
            }
        }

        String t = text;  // Read the current text
        studentsRead++;  // Increment the count of students who have read
        // If all students have read, notify the teacher
        if (studentsRead == numberOfStudents) {
            notifyAll();  // Notify the teacher that all students have read
        }

        return t;  // Return the text read
    }
}
