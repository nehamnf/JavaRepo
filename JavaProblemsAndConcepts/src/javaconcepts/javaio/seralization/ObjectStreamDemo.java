package javaconcepts.javaio.seralization;


import java.io.*;

class Student implements Serializable {
    private int rollNo;
    public String name;
    private String dept;
    private static int data=10;
    private transient  String dob="20/07/1997";

//    public Student(){
//
//    }
    public Student(int rollNo, String name, String dept, String dob) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.dob = dob;
    }

    public static void setData(int data){
        Student.data=data;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", dob='" + dob + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fo = new FileOutputStream("src/javaconcepts/javaio/seralization/student.txt");
        ObjectOutputStream o = new ObjectOutputStream(fo);

        Student s= new Student(101,"neha","CSE","20/07/1997");

        // Serialize the second Student object
        Student s2 = new Student(102, "Safi", "ECE", "15/08/1998");

        o.writeObject(s);
        o.writeObject(s2);
        fo.close();
        o.close();

        Student.setData(500);

        FileInputStream fis = new FileInputStream("src/javaconcepts/javaio/seralization/student.txt");
        ObjectInputStream oi=new ObjectInputStream(fis);

        Student s1= (Student) oi.readObject();
        Student s3= (Student) oi.readObject();
        System.out.println(s1);
        System.out.println(s3);
//        System.out.println(s1.rollNo);
//        System.out.println(s1.name);
//        System.out.println(s1.dept);
        fis.close();
        oi.close();

    }
}
