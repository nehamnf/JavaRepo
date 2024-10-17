package javaconcepts.javaio;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {
    public static void main(String[] args) throws IOException {
        File f= new File("src/javaconcepts/javaio/yy.txt");
        f.createNewFile();
        f.isFile();
    }
}
