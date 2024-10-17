package javaconcepts.javaio;

import java.io.*;
import java.nio.CharBuffer;

public class CopyingFiles {
    public static void main(String[] args) throws IOException {

        FileWriter w= new FileWriter("src/javaconcepts/javaio/file1.txt");
        String s= "JAVA TEXT FILE";
        w.write(s);
        w.append(" NEHA ");
        w.close();

        FileReader fr = new FileReader("src/javaconcepts/javaio/file1.txt");
//        CharBuffer buffer = CharBuffer.allocate(1024);
//        // Read from the file until the end is reached
//        int charsRead;
//        while ((charsRead = fr.read(buffer)) != -1) {
//            buffer.flip(); // Prepare the buffer for reading
//            System.out.print(buffer); // Print the characters read
//            buffer.clear(); // Clear the buffer for the next read
//        }
       StringBuilder sb= new StringBuilder();
       int charRead;
        while ( (charRead= fr.read()) !=-1){
            sb.append((char)charRead);
        }

        fr.close();

        FileWriter fw= new FileWriter("src/javaconcepts/javaio/file2.txt");
        fw.write(sb.toString().toLowerCase());
        fw.close();

        System.out.println("\nFile read successfully.");

        FileInputStream fis= new FileInputStream("src/javaconcepts/javaio/file1.txt");
        FileInputStream fis2= new FileInputStream("src/javaconcepts/javaio/file2.txt");
        SequenceInputStream sis= new SequenceInputStream(fis,fis2);
        FileOutputStream fo= new FileOutputStream("src/javaconcepts/javaio/destination.txt");

        int b;
        while((b = sis.read()) != -1){
            fo.write(b);
        }
    }
}
