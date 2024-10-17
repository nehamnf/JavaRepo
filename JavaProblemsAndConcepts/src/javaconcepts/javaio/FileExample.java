package javaconcepts.javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args){

        try {
            int len= 1;
            FileOutputStream fo = new FileOutputStream("src/javaconcepts/javaio/test.txt");
            String str="Learn java programming";
//            fo.write(String.valueOf(str.getBytes().length).getBytes());
            fo.write(str.getBytes());

            fo.close();

            FileInputStream fi= new FileInputStream("src/javaconcepts/javaio/test.txt");
            System.out.println(fi.available());
            int i=0;
            fi.mark(0);
            System.out.println("---"+fi.markSupported());
            String s1= new String(fi.readAllBytes());
            System.out.println("S1: "+s1);
            fi.reset();
            while(i < 22){
                char s= (char) fi.read();
                System.out.print(s);
                i++;
            }
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
