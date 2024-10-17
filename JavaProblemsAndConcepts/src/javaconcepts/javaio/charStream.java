package javaconcepts.javaio;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.Arrays;

public class charStream {
    public static void main(String[] args) throws IOException {
        char[] c= new char[]{'z','y','x','v'};
        CharArrayReader cr= new CharArrayReader(c);
        int i;
        while ((i = cr.read()) != -1){
            System.out.print((char) i);
        }

        cr.close();

        System.out.println();
        CharArrayWriter cw= new CharArrayWriter(20);
        cw.write('j');
        cw.write('k');
        System.out.println(cw);

    }
}
