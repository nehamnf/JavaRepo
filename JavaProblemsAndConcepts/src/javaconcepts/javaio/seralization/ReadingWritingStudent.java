package javaconcepts.javaio.seralization;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingWritingStudent {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student[] s= new Student[]{
                new Student(101,"neha","CSE","20/07/1997"),
                new Student(102,"safi","CSE","21/07/1997"),
                new Student(103,"suhail","CSE","22/07/1997"),
                new Student(104,"naseem","CSE","23/07/1997")
        };

        FileOutputStream fo = new FileOutputStream("src/javaconcepts/javaio/seralization/studentList.txt");
        ObjectOutputStream o= new ObjectOutputStream(fo);

        o.writeObject(s);

        fo.close();
        o.close();

        FileInputStream fi= new FileInputStream("src/javaconcepts/javaio/seralization/studentList.txt");
        ObjectInputStream oi= new ObjectInputStream(fi);

        Student[] s1= (Student[]) oi.readObject();

        System.out.println("Enter the Student name to search");
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();

        for(Student stu: s1){
            if (stu.name.equalsIgnoreCase(name)){
            System.out.println(stu);
            }
        }
    }
}
