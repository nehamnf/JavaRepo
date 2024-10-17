package javaconcepts.javaio;

import java.io.*;

public class DataInputOutPutStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo= new FileOutputStream("src/javaconcepts/javaio/Student.txt");
        DataOutputStream d = new DataOutputStream(fo);

        Student s= new Student();
        s.rollNo=121;
        s.name="neha";
        s.dept="CSE";

        d.writeInt(s.rollNo);
        d.writeUTF(s.name);
        d.writeUTF(s.dept);

        fo.close();
        d.close();


        FileInputStream fr= new FileInputStream("src/javaconcepts/javaio/Student.txt");
        DataInputStream br= new DataInputStream(fr);
        Student s2 = new Student();
        s2.rollNo= br.readInt();
        s2.dept= br.readUTF();
        s2.name=br.readUTF();
        System.out.println(s2.rollNo);
        System.out.println(s2.dept);
        System.out.println(s2.name);
    }
}
