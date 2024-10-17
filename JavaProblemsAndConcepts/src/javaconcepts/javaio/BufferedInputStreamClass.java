package javaconcepts.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamClass {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("src/javaconcepts/javaio/test.txt");
        BufferedInputStream bis= new BufferedInputStream(fis);
        int b;

        System.out.println(bis.markSupported());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(1);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        while((b = bis.read())!=-1){
            System.out.print((char)b);
        }

        System.out.println();
        bis.reset();
        while((b = bis.read())!=-1){
            System.out.print((char)b);
        }

        bis.close();
        fis.close();

    }
}
