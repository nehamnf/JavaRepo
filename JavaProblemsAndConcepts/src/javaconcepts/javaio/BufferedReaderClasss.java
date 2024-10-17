package javaconcepts.javaio;

import java.io.*;

public class BufferedReaderClasss {
    public static void main(String[] args) throws IOException {
        FileReader fr= new FileReader("src/javaconcepts/javaio/test.txt");
        BufferedReader br= new BufferedReader(fr);
        int b;
        while((b = br.read()) != -1){
            System.out.print((char) b);
        }
        fr.close();
        br.close();

        InputStreamReader is= new InputStreamReader(System.in);
        BufferedReader br1= new BufferedReader(is);
        System.out.println(br1.readLine());
        is.close();
        br1.close();
    }
}
