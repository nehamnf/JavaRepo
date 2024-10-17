package javaconcepts.javaio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteDemo {
    public static void main(String[] args) throws IOException {
        byte[] b= new  byte[]{'a','b','c','d'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        int i;
        while ((i = bis.read()) !=-1){
            System.out.print((char)i);
            System.out.print((char) i);
        }
        bis.close();

        System.out.println();

        ByteArrayOutputStream bos= new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        System.out.println(bos);
        bos.writeTo(new FileOutputStream("src/javaconcepts/javaio/byte.txt"));
        bos.close();

    }
}
