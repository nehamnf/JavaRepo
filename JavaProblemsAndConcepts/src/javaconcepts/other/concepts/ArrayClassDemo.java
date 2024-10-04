package javaconcepts.other.concepts;

import java.util.Arrays;

public class ArrayClassDemo {
    public static void main(String[] args) {

        int[] intArr = { 10, 20, 15, 22, 35 };
        int[][] intArr2 = { { 10, 20, 15, 22, 35 },{2,3,4} };

        System.out.println(Arrays.toString(intArr));
        System.out.println(intArr.toString());
        System.out.println(intArr2.toString());
        System.out.println(Arrays.toString(intArr2));
        System.out.println(Arrays.deepToString(intArr2));
        System.out.println("Integer Array as List: "
                + Arrays.asList(intArr));

        Student[] arr = { new Student(111, "bbbb", "london"),
                new Student(131, "aaaa", "nyc"),
                new Student(121, "cccc", "jaipur") };

        System.out.println(arr.toString());


    }
}

class Student {
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name,
                   String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
//    @Override
//    public String toString()
//    {
//        return this.rollno + " " + this.name + " " + this.address;
//    }
}
