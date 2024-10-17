package javaconcepts.javaio;

import java.io.*;

class Student{
    int rollNo;
    String name;
    String dept;
}

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream  fo= new FileOutputStream("src/javaconcepts/javaio/Student.txt");
        PrintStream p = new PrintStream(fo);
        p.println(1);
        p.println("neha farheen");

        Student s= new Student();
        s.rollNo=121;
        s.name="neha";
        s.dept="CSE";

        p.println(s.rollNo);
        p.println(s.name);
        p.println(s.dept);

        fo.close();
        p.close();


        FileReader fr= new FileReader("src/javaconcepts/javaio/Student.txt");
        BufferedReader br= new BufferedReader(fr);
        Student s2 = new Student();
        s2.rollNo= Integer.parseInt(br.readLine());
        s2.dept= br.readLine();
        s2.name=br.readLine();
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());


//        BufferedWriter b= new BufferedWriter(new OutputStreamWriter(System.out));
//        b.write("neha");
//        b.flush();
    }
}
