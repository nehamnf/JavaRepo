package javaconcepts.javaio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFiles {
    public static void main(String[] args) throws IOException {
        RandomAccessFile r= new RandomAccessFile("src/javaconcepts/javaio/data.txt","rw");
        System.out.println((char)r.read());
        System.out.println((char)r.read());
        r.write('z');
        r.seek(5);
        System.out.println((char)r.read());
    }
}
